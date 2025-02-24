


package com.tutorial.app;  // Defines the package for structuring the project

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component marks this class as a Spring-managed bean, so it will be automatically detected and instantiated
@Component
public class Dev {

    // @Autowired enables Spring to automatically inject the Laptop bean into this class
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    // This is not a constructor, it's a method due to the return type (void)
    // Constructor injection should not have a return type; this will not work as expected



    // Method to simulate the development process
    public void build() {
        // Calls the compile() method from the injected Laptop bean
        comp.compile();

        System.out.println("This is a project");
    }
}
