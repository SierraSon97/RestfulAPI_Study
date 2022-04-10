package com.example.restfulapi_study.controller;


import com.example.restfulapi_study.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }
    @GetMapping("query-param")
    public String queryParam(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
