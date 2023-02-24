import java.util.List;

public class Viewer {

    private String Name; 
    private int Money;
    private Bet Bet; 

    public String getName() {
        return Name;
    }
    
    public int getMoney() {
        return Money;
    }
    public void setMoney(int money) {
        Money = money;
    } 

    @Override 
    public String toString() {
        return String.format("My name is %s and I've %s$",getName(), getMoney()); 
    } 
}


