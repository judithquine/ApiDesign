package com.rest.factoria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    private static int total = 1;

    @GetMapping("total")
    public int Total(){
        return total;
    }

    @GetMapping("hello")
    public String Hello(){
        return "Hello";
    }

    @PostMapping("add")
    public void Add(int valueToAdd){
        total += valueToAdd;
    }
}
