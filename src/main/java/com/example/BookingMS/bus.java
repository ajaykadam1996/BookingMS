package com.example.BookingMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {return  "Please book your bus ticket for shimla t 35% discount" ; }
}
