package com.practice.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "World") String name) {
        String msg = "Hello, " + name;
        return msg;
    }

    @GetMapping("/")
    public String index() {
        return "Your application is running successfully";
    }
}
