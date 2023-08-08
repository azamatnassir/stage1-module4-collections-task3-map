package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> freq = new HashMap<>();

        for (String s : List.of(Arrays.stream(sentence.toLowerCase().split("[,. ]")).filter(e -> !e.trim().isEmpty()).toArray(String[]::new))) {
            int prev = 0;
            if (freq.get(s) != null) {
                prev = freq.get(s);
            }
            freq.put(s, prev + 1);
        }

        return freq;
    }
}
