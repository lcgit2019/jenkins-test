package com.example.requesttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RequestTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RequestTestApplication.class, args);
    }

    @RequestMapping("/jenkinsTest")
    public String say(){
        return "jenkins-test";
    }

}
