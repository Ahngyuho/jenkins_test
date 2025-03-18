package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {
    @GetMapping("/ex01")
    public String test() {
        return "ex01 - test";
    }
}
