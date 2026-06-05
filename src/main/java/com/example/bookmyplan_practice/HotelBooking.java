package com.example.bookmyplan_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelBooking {

    @GetMapping("/hotelbooking")
    public String getName() {
        return "Book your hotel as soon as possible bookings are going to full";
    }
}