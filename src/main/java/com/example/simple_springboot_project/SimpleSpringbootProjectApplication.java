package com.example.simple_springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringbootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringbootProjectApplication.class, args);
        System.out.println("Hi");
    }

}
