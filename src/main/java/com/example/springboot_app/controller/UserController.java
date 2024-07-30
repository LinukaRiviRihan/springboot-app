package com.example.springboot_app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/")
public class UserController {
    @GetMapping(value = "/getUser")
    public String getUser() {
        return "All users";
    }
}
