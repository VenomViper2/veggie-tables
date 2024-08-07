import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VegtableRotationTest {

    @Test
    void testRotationOptionsExist() {
        List<String> rotationList;
        Rotation rotation = new Rotation();
        rotationList = rotation.search("carrot");
        assertThat(rotationList).contains("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean");
    }
}
