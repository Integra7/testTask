package com.example.testtask.service;

import org.junit.jupiter.api.Test;

import java.util.Map;
import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterFrequencyServiceTest {
    static CharacterFrequencyService characterFrequencyService = new CharacterFrequencyService();

    @Test
    void analyzeString() {
        String testString = "aaaaabcccc";
        Map<Character, Integer> actualMap = characterFrequencyService.analyzeString(testString);

        Map<Character, Integer> expectedMap = Map.ofEntries(
                entry('a', 5),
                entry('c', 4),
                entry('b', 1)
        );
        assertEquals(expectedMap, actualMap);

    }


    @Test
    void analyzeString2() {

        String testString2 = "aabbccdd";
        Map<Character, Integer> actualMap2 = characterFrequencyService.analyzeString(testString2);

        Map<Character, Integer> expectedMap2 = Map.ofEntries(
                entry('a', 2),
                entry('b', 2),
                entry('c', 2),
                entry('d', 2)
        );

        assertEquals(expectedMap2, actualMap2);
    }
}