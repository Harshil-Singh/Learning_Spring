package com.tutorial.app;  // Defines the package for structuring the project

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component marks this class as a Spring-managed bean
// This means Spring will automatically create an instance of Laptop and manage it in the application context
@Component
@Primary
public class Laptop implements Computer {

    // Method to simulate a compile process
    public void compile() {
        System.out.println("Compiling...");
    }
}
