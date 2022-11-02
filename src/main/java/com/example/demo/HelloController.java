package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * RestController: hvordan bruker interagerer med API-et
 * GetMapping: entry point
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Reiseforsikring \nDu betaler 249 kr/mnd";
    }

    @GetMapping("/fakturaoversikt")
    public String hello() {
        return "Oktober: 249 kr";
    }

    @GetMapping("/dokument")
    public String dokument() {
        return "Her skal det ligge et PDF-dokument :)";
    }

}