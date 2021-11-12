package com.example.azure_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzurePracticeApplication.class, args);
    }


    @GetMapping("/")
    public String helloWorld(@RequestParam(defaultValue = "Cloud") String name) {
        return "Hello " + name;
    }
}