package com.example.bookmyplan_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WinterCamp {

    @GetMapping("/WinterCamp")
    public String getName() {
        return "Welcome to WinterCamp on 19 JUNE-2026";
    }
}
