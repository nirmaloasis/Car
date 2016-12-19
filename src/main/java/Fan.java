/**
 * Created by localadmin on 19/12/16.
 */
public class Fan extends AutoPart{

    int numberOfBlades = 0;
    float diameterInCentimeters = 0;

    Fan(String manufacturer, int partNumber, String description, int numberOfBlades,float diameterInCentimeters) {
        super(manufacturer,partNumber,description);
        this.numberOfBlades = numberOfBlades;
        this.diameterInCentimeters = diameterInCentimeters;
    }
}
