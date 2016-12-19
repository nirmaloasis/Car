/**
 * Created by localadmin on 19/12/16.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void createClass_isInitializedWithVariables() {

        Radiator radiator = new Radiator("Nissan",7,"Radiator Desc", 4.4f);
        Fan fan = new Fan("Nissan",3,"Fan Desc",4,4.4f);

        CoolingSystem coolingSystem = new CoolingSystem(radiator,fan);
        EngineComponent engineComponent = new EngineComponent("Nissan",2,"Engine Desc",5,"Lift me","Bad timing");

        Car car = new Car("Nissan",7, "cool Nissan",34f,4.3f, coolingSystem,engineComponent);

        assertEquals("Nissan",car.manufacturer);
        assertEquals(7,car.partNumber);
        assertEquals("cool Nissan",car.description);
        assertEquals(34 ,car.displacement,0);
        assertEquals(4.3f,car.compressionRatio,0);

        assertEquals(coolingSystem,car.coolingSystem);
        assertEquals(engineComponent,car.engineComponent);

        assertTrue(car.coolingSystemComponent(fan));
        assertFalse(car.coolingSystemComponent(engineComponent));

    }

}
