/**
 * Created by localadmin on 19/12/16.
 */
public class EngineComponent extends AutoPart{
    int duration = 0;
    String lift = null;
    String timing = null;

    EngineComponent(String manufacturer, int partNumber, String description, int duration, String lift, String timing) {
        super(manufacturer,partNumber,description);
        this.duration = duration;
        this.lift = lift;
        this.timing = timing;
    }

}
