import java.util.List;

public class Race extends Vehicule {

    public Race(int speed, int adhesion, String pilotName) {
        super(speed, adhesion, pilotName);
    }

    public int MinVehicle = 5; 
    public int MaxVehicle = 50; 
    public List<Vehicule> AllVehicles;
    public List<Viewer> AllViewers; 

    public void AddVehicle(Vehicule vehicule) {
        AllVehicles.add(vehicule);
    }

    public void AddViewer(Viewer viewer) {
        AllViewers.add(viewer); 
    }

    public List<Vehicule> StartRace() {
        int distanceToTravel = (int) Math.random() * (10 - 1) + 1; 
        for (int i = 0; i <= distanceToTravel; i++) { 
            Forward();
            getDistanceTraved(); 
            Accident();
        }
        return AllVehicles; 
    }
}
