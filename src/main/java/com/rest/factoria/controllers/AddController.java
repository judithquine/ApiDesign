package com.rest.factoria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddController {

    private static Integer totalValue = 1;


    @GetMapping("hello")
    public String Hello(String name, Integer age) {
        return "Hello " + name + " " + age;
    }

    @GetMapping("total")
    public Integer total() {
        return totalValue;
    }

    @PostMapping("add")
    public Integer add(Integer valueToAdd) {
        return totalValue+=valueToAdd;
    }

    @PostMapping("subtraction")
    public Integer subtraction(Integer valueToSubtract) {
        return totalValue-=valueToSubtract;
    }
}
