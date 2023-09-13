package com.example.testtask.service;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
@Service
public class CharacterFrequencyService
{
    public Map<Character, Integer> analyzeString(String input)
    {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : input.toCharArray())
        {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }
        return frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));

    }
}
