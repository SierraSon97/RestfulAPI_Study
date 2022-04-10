package com.example.restfulapi_study.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping("/hello")
    public String hello(){
        return "get Hello";
    }
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "get hi";
    }

    @GetMapping("/path-variable")
    public String pathVariable(){
        return "";
    }
}
