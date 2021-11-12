package com.example.azure_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

@SpringBootApplication
@RestController
public class AzurePracticeApplication {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(AzurePracticeApplication.class, args);
    }


    @GetMapping("/")
    public String helloWorld(@RequestParam(defaultValue = "Cloud") String name) {
        return "Hello there " + name;
    }

    @GetMapping("/user-agent")
    public String userAgent(HttpServletRequest request) {
        return request.getHeader("User-Agent");
    }

    @GetMapping("/")
    public String databaseTest(){
        return "SELECT 1";
    }
}
