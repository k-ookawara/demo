package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

    @GetMapping(path = "rest")
    public String get() {
        return "Rest";
    }
}
