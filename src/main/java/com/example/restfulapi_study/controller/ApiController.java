package com.example.restfulapi_study.controller;


import com.example.restfulapi_study.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring boot";
    }
    //text
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    @PostMapping("/json")
    public UserRequest json(@RequestBody UserRequest user){
        return user;
    }
}
