package com.rabbit.samples.springdevtoolsdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @GetMapping("/")
    String hello() {
        return "Hello, everybody!\n";
//        return "Hello, my friends!\n";
    }

}
