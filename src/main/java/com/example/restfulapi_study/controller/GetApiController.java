package com.example.restfulapi_study.controller;


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
    public String queryParam(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;
    }

}
