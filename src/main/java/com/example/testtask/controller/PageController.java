package com.example.testtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.example.testtask.service.CharacterFrequencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class PageController {

    @Autowired
    CharacterFrequencyService characterFrequencyService;

    @PostMapping("/analyze")

    public ResponseEntity<Map<Character,Integer>>analysis(@RequestBody String input)
    {

        Map<Character, Integer> result = characterFrequencyService.analyzeString(input);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
