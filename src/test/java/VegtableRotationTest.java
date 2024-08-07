import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VegtableRotationTest {

    @Test
    void testRotationOptionsExistForCarrot() {
        Rotation rotation = new Rotation();
        assertThat(rotation.search("carrot")).contains("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean");
    }

    @Test
    void testRotationOptionsExistForBroccoli(){
        Rotation rotation = new Rotation();
        assertThat(rotation.search("broccoli")).contains("Potato","Parsnip","tomato","carrot","lettuce");
    }
}
