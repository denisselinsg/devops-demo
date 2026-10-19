package com.example.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello2")
    public String hello() {
        return "DevOps demo - AUTOMATED DEPLOYMENT WORKS! 🚀";
    }
}
