import org.junit.jupiter.api.Test;
import org.veggies.SoilType;
import org.veggies.VegetableRotation;

import static org.assertj.core.api.Assertions.assertThat;

public class VegetableRotationTest {

    @Test
    void testRotationOptionsExistForCarrot() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("carrot", SoilType.STANDARD)).contains("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean");
    }

    @Test
    void testRotationOptionsExistForBroccoli() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        assertThat(vegetableRotation.search("broccoli", SoilType.STANDARD)).contains("Potato","Parsnip","tomato","carrot","lettuce");
    }

    @Test
    void whenSoilTypeAcidicCorrectOptionsReturnedForCarrot() {
        VegetableRotation vegetableRotation = new VegetableRotation();
        Vegetable vegetable = new Vegetable();

        assertThat(vegetableRotation.search(vegetable.getName(), SoilType.ACIDIC)).contains("Potato", "Pumpkin", "Cucumber", "Chickpea", "Soy Bean");
    }

}
