package com.epam.pizza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private static final String HELLO_WORLD = "Test";

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return HELLO_WORLD;
    }

    @GetMapping("/GetProducts")
    public List getProducts() {
        return null;
    }

    @PostMapping("/CreateOrder")
    public boolean createOrder() {
        return true;
    }

}
