package org.veggies;

import java.util.*;

public class VegetableRotation {
    Map<String,List<String>> rotationMap;

    public VegetableRotation() {
        rotationMap = new HashMap<>();
        rotationMap.put("carrot", Arrays.asList("Green bean", "Pea", "Peanut", "Chickpea", "Soy Bean"));
        rotationMap.put("broccoli", Arrays.asList("Potato","Parsnip","tomato","carrot","lettuce"));
    }



    public List<String> search(String vegetableName, SoilType soilType) {
        if (soilType == SoilType.ACIDIC) {
            return List.of("Potato", "Pumpkin", "Cucumber", "Chickpea", "Soy Bean");
        }
        return rotationMap.get(vegetableName);
    }

}
