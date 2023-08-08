package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> rev = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet())
            if (rev.containsKey(entry.getValue())) {
                if (rev.get(entry.getValue()) > entry.getKey()) {
                    rev.replace(entry.getValue(), entry.getKey());
                }
            } else {
                rev.put(entry.getValue(), entry.getKey());
            }

        return rev;
    }
}
