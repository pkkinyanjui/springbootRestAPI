package com.example.pkinyanjui.helloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
@RequestMapping("/home")
    public String getGreeting(){
        //System.out.println("Testing...");
        return "Hello, this is Peter";
    }
}
