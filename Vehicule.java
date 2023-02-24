public abstract class Vehicule {

    private int DistanceTraved; 
    private int Speed; 
    private int Adhesion; 
    private int Out; 
    private String PilotName;
    private Boolean End; 

    public Vehicule(int speed, int adhesion, String pilotName) {
        this.Out = 0; 
        this.End = false; 
        this.Speed = speed; 
        this.Adhesion = adhesion; 
        this.PilotName = pilotName; 
    }

    public void Forward() { 
        this.setDistanceTraved(Speed * (11 - Adhesion)); 
        Accident();
        if (Out > 0) {
            this.setDistanceTraved(DistanceTraved);
        }
    }

    public void Accident() { 
        int n = (int) Math.random() * (10 - 1) + 1; 
        if (n > Adhesion) {
            Out = n; 
        }
        
    }
     
    public int getDistanceTraved() {
        return DistanceTraved;
    }

    public void setDistanceTraved(int distanceTraved) {
        DistanceTraved = distanceTraved;
    }

    public int getOut() {
        return Out;
    }

    public void setOut(int out) {
        Out = out;
    }

    public Boolean getEnd() {
        return End;
    }

    public void setEnd(Boolean end) {
        End = end;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getAdhesion() {
        return Adhesion;
    }

    public String getPilotName() {
        return PilotName;
    }

}

