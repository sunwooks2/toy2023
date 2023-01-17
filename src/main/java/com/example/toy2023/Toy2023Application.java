package com.example.toy2023;

import com.example.toy2023.controller.ToyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Toy2023Application {

    public static void main(String[] args) {
        System.out.println("push test");
        SpringApplication.run(ToyController.class, args);
    }

}
