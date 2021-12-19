package com.company.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Usa", List.of("Alex", "Smith"));
        map.put("Australia", List.of("Finch", "Warner"));
        map.put("England", List.of("Joe", "David"));
        System.out.println(map);

        Map map1 = new HashMap<>();
        map1.put(91, "Africa");
    }
}
