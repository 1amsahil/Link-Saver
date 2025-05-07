package com.eternity.linksaver.controller;

import com.eternity.linksaver.model.Users;
import com.eternity.linksaver.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CustomUserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody Users user) {
        userService.saveUser(user);
        return "User registered successfully!";
    }
}
