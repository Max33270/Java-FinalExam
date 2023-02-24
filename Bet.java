import java.util.List;

public class Bet {

    private String PilotName; 
    private int Money;


    public int getMoney() {
        return Money;
    }

    public String getPilotName() {
        return PilotName;
    }

    @Override
    public String toString() {
        return String.format("Bet %s€ on John",getMoney(), getPilotName()); 
    }    

    public int Win(List<Vehicule> myPilots) {
        if (myPilots.subList(1, 4).contains(PilotName)) { 
            return Money; 
        } else {
            return 0; 
        }
    }

    public int Lose(List<Vehicule> myPilots) {
        if (myPilots.subList(1, 4).contains(PilotName) == false) {
            return 0; 
        } else {
            return Money; 
        }
    }
}
