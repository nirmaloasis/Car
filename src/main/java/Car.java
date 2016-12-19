/**
 * Created by localadmin on 19/12/16.
 */
public class Car extends AutoPart{
    float displacement = 0;
    float compressionRatio = 0;

    CoolingSystem coolingSystem = null;

    EngineComponent engineComponent = null;

    Car(String manufacturer, int partNumber, String description, float displacement, float compressionRatio, CoolingSystem coolingSystem, EngineComponent engineComponent) {
        super(manufacturer,partNumber,description);
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;

        this.coolingSystem = coolingSystem;

        this.engineComponent = engineComponent;
    }

    public boolean coolingSystemComponent(AutoPart autoPart) {
     return true;
    }
}
