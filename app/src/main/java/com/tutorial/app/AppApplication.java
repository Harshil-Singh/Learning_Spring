package com.tutorial.app;  // Defines the package for organizing the classes

// Import necessary Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication is a combination of three annotations:
// 1. @Configuration - Marks this class as a configuration class for Spring beans
// 2. @EnableAutoConfiguration - Enables Spring Boot’s auto-configuration feature
// 3. @ComponentScan - Scans the package and its sub-packages for Spring components
@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		// SpringApplication.run() starts the Spring Boot application
		// It creates an ApplicationContext, which is a container for all Spring-managed beans
		ApplicationContext context = SpringApplication.run(AppApplication.class, args);

		// Retrieves a Spring bean of type Dev from the application context
		// A Spring Bean is an object managed by Spring, created automatically when the application starts
		// Beans are singletons by default, meaning only one instance exists per application context
		Dev obj = context.getBean(Dev.class);

		// Calls the build() method on the Dev bean
		obj.build();
	}
}
