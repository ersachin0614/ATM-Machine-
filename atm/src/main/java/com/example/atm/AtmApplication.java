package com.example.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AtmApplication.class);
        
        // port to 8081
        app.setDefaultProperties(java.util.Collections.singletonMap("server.port", "8081"));
        
        app.run(args);
    }
}
