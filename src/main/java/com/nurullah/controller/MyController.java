package com.nurullah.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {

    @GetMapping
    public String hello() {
        return "Hello, make some CI/CD practice!!";
    }

    @GetMapping("/docker")
    public String dockerised() {
        return "Hello from docker container";
    }
}
