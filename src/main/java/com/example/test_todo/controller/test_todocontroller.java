package com.example.test_todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test_todo")
public class test_todocontroller {
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        String x = "Hi ";
        return x+name;

    }
}
