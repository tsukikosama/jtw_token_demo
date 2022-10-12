package com.miku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class JwtApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class,args);
    }
}
