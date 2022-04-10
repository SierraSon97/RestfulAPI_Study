package com.example.restfulapi_study.controller;

import com.example.restfulapi_study.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put/{userID}")
    public void put(@RequestBody PostRequestDTO requestData, @PathVariable(name = "userID") Long id){
        System.out.println(requestData);
        System.out.println(id);
    }
}
