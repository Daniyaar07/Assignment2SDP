import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;
public class Main {
    public static void main(String[] args){
        Logistics road = new RoadLogistics();
        road.planDelivery("Equipment" , "Astana");

        Logistics sea = new SeaLogistics();
        sea.planDelivery("Cars" , "Almaty");
    }
}