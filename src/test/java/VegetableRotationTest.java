import org.junit.jupiter.api.Test;
import org.veggies.VegetableRotation;

import static org.assertj.core.api.Assertions.assertThat;

public class VegetableRotationTest {

    @Test
    void testRotationOptionsExistForCarrot() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("carrot")).contains("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean");
    }

    @Test
    void testRotationOptionsExistForBroccoli(){
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("broccoli")).contains("Potato","Parsnip","tomato","carrot","lettuce");
    }
}
