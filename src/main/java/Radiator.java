/**
 * Created by localadmin on 19/12/16.
 */
public class Radiator extends AutoPart{

    float coolantPressure = 0;

    Radiator(String manufacturer, int partNumber, String description, float coolantPressure) {
        super(manufacturer,partNumber,description);
        this.coolantPressure = coolantPressure;
    }
}
