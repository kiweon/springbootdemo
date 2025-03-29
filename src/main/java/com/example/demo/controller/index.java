package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
    @GetMapping("/")
    public String home(){
        return "<H2>2번째 수정하였습니다!</H2>";
    }
}
