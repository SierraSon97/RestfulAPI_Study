package com.example.restfulapi_study.controller;

import com.example.restfulapi_study.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put")
    public void put(@RequestBody PostRequestDTO requestData){


    }
}
