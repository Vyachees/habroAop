package com.example.habroaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HabroAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(HabroAopApplication.class, args);
    }

}
