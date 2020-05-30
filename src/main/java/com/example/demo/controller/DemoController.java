package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${myprofile.name}")
    private String profileName;

    @GetMapping("/myprofile")
    public String myprofile() {
        return "my profile is " + profileName + "!";
    }

}
