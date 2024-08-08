import org.junit.jupiter.api.Test;
import org.veggies.VegetableRotation;

import static org.assertj.core.api.Assertions.assertThat;

public class VegetableRotationTest {

    @Test
    void testRotationOptionsExistForCarrot() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("carrot", "standard")).contains("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean");
    }

    @Test
    void testRotationOptionsExistForBroccoli() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("broccoli", "standard")).contains("Potato","Parsnip","tomato","carrot","lettuce");
    }

    @Test
    void whenSoilTypeAcidicCorrectOptionsReturnedForCarrot() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("carrot", "acidic")).contains("Potato", "Pumpkin", "Cucumber", "Chickpea", "Soy Bean");
    }

}
