package app;
import abstractfactory.Button;
import abstractfactory.Checkbox;
import abstractfactory.GUIFactory;
import factorymethod.Logistics;
public class DeliveryApplication {
    private Button button;
    private Checkbox checkbox;
    private Logistics logistics;

    public DeliveryApplication(GUIFactory factory , Logistics logistics){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }
    public void run(String cargo , String destination){
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}
