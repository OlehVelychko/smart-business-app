package com.example.smartbusinessapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Используйте @RestController вместо @Controller
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Hello World");
        return "Hello, World!";  // Это будет отправлено как тело ответа
    }
}