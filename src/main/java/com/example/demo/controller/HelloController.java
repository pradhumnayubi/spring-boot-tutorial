package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld(){
//        System.out.println("Welcome to yubi");
        return "Welcome to yubi aaaaaaaaaaa";
    }
}
