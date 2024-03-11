package com.springboot.springsecurity1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.springsecurity1.controller")
public class SpringSecurity1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity1Application.class, args);
    }

}
