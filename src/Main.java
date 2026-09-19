import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;
import java.util.Scanner;
import abstractfactory.GUIFactory;
import abstractfactory.WindowsFactory;
import abstractfactory.MacOSFactory;
import app.DeliveryApplication;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input delivery mode: ");
        String deliveryMode = scanner.nextLine();

        System.out.println("Input UI platform: ");
        String platform = scanner.nextLine();

        Logistics logistics;
        if (deliveryMode.equalsIgnoreCase("ROAD")){
            logistics = new RoadLogistics();
        }
        else if (deliveryMode.equalsIgnoreCase("SEA")){
            logistics = new SeaLogistics();
        }
        else{
            System.out.println("Unsupported delivery mode");
            return;
        }

        GUIFactory factory;
        if (platform.equalsIgnoreCase("WINDOWS")){
            factory = new WindowsFactory();
        }
        else if(platform.equalsIgnoreCase("MACOS")){
            factory = new MacOSFactory();
        }
        else{
            System.out.println("Unsupported UI platform");
            return;
        }
        DeliveryApplication app = new DeliveryApplication(factory , logistics);
        app.run("Equipment" , "Astana");
    }
}