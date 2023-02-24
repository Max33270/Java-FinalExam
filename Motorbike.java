
public class Motorbike extends Vehicule {

    private int speedStr = generateRandSpeed(); 
    private int adhesionStr = generateRandAdh(); 

    public Motorbike(int speed, int adhesion, String pilotName) {
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
        int min = 1; 
        int max = 5;
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
        if (adhesionStr == 1 || adhesionStr == 2) {
            return "barely sticks to the ground"; 
        } else if (adhesionStr == 3 || adhesionStr == 4) {
            return "sticks to the ground"; 
        } else {
            return "grips the ground quite well"; 
        }
    }
}
