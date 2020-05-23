package com.rabbit.samples.springdevtoolsdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @GetMapping("/world")
    String hello() {
        return "Hello, world!\n";
    }

}
