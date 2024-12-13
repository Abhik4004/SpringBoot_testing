package com.example.demo;

// import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.components.Student;

// @Configuration
// public class WebConfig implements WebMvcConfigurer {

//   @Override
//   public void addCorsMappings(CorsRegistry registry) {
//     registry.addMapping("/**").allowedOrigins("http://localhost:5173")
//         .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("*");
//   }
// }

@RestController
public class MyController {

  // Default route
  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/")
  public String hello() {
    return "Hello Spring Boot!";
  }

  @PostMapping("/send")
  public String send(@RequestBody Student student) {
    return "Received student with name: " + student.getName() + " and age: " + student.getAge();
  }

  // Health route
  @GetMapping("/health")
  public String healthCheck() {
    return "<h1>System is running fine!</h1>";
  }

  // Route to return a greeting with a name
  @GetMapping("/greet")
  public String greet() {
    return "Welcome to the Spring Boot application!";
  }

  // Route to return a simple JSON object
  @CrossOrigin(origins = "http://localhost:5173")
  @GetMapping("/json")
  public String jsonResponse() {
    return "{\"message\": \"This is a JSON response!\"}";
  }

  // Another route returning HTML content
  @GetMapping("/welcome")
  public String welcome() {
    return "<html><body><h2>Welcome to our site!</h2><p>We are happy to have you here.</p></body></html>";
  }

  @GetMapping("/testing")
  public String testing() {
    return "Testing!";
  }
}
