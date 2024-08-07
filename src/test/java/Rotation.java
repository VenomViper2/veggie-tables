import java.util.*;

public class Rotation {
    Map<String,List<String>> rotationMap;

    public Rotation() {
        rotationMap = new HashMap<>();
        rotationMap.put("carrot", Arrays.asList("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean"));
        rotationMap.put("broccoli", Arrays.asList("Potato","Parsnip","tomato","carrot","lettuce"));
    }


    public List<String> search(String vegetableName) {
        return rotationMap.get(vegetableName);
    }
}
