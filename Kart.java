public class Kart extends Vehicule {

    private int speedStr = generateRandSpeed(); 
    private int adhesionStr = generateRandAdh(); 

    public Kart(int speed, int adhesion, String pilotName) {
        super(speed, adhesion, pilotName);    
    }

    @Override
    public String toString() {
        return String.format("This %s is %s, it has a %s speed value, and it %s with a %s value of adhesion",getClass().getName().toUpperCase(), Speedy(), generateRandSpeed(), Adhesy(), generateRandAdh()); 
    } 

    public int generateRandSpeed() {
        int min = 5; 
        int max = 10;
        return (int) ((Math.random() * (max - min)) + min);
    } 

    public int generateRandAdh() {
        int min = 5; 
        int max = 10;
        return (int) ((Math.random() * (max - min)) + min);
    } 

    public String Speedy() {
        if (speedStr == 5 || speedStr == 6) {
            return "rather fast"; 
        } else if (speedStr == 7 || speedStr == 8) {
            return "fast"; 
        } else {
            return "very fast"; 
        }
    }

    public String Adhesy() {
        if (adhesionStr == 5 || adhesionStr == 6) {
            return "grips the ground quite well"; 
        } else if (adhesionStr == 7 || adhesionStr == 8) {
            return "adheres well to the ground"; 
        } else {
            return "adheres perfectly"; 
        }
    }
}

// | Value | Speed | Adhesion |
// | --- | --- | --- |
// | 1 - 2 | “slow” | "barely sticks to the ground” |
// | 3 - 4 | "rather slow” | "sticks to the ground” |
// | 5 - 6 | “rather fast” | "grips the ground quite well” |
// | 7 - 8 | “fast” | "adheres well to the ground" |
// | 9 - 10 | “very fast” | "adheres perfectly” |