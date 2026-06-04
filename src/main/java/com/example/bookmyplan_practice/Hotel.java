package com.example.bookmyplan_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {

    @GetMapping("/hotel")
    public String getName() {
        return "Hotel Sagar , Narhe ,Pune";
    }
}