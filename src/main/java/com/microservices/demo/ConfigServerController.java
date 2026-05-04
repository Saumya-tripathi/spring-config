package com.microservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerController {

    @GetMapping("/")
    public String home() {
        return "Spring Cloud Config Server is Running!\n\n" +
                "Available Endpoints:\n" +
                "1. GET /{application}/{profile}/{label} - Fetch configuration for a specific application\n" +
                "2. GET /{application}/{profile} - Fetch configuration with default label (main/master)\n" +
                "3. GET /health - Health check endpoint\n\n" +
                "Example: /config-client/dev/main";
    }

    @GetMapping("/health")
    public String health() {
        return "{ \"status\": \"UP\", \"application\": \"config-server\" }";
    }
}

