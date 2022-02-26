## Project setup

You have 2 options to get the project.

1. Generate a new project from scratch: 
   - 1. Create a new project at https://start.spring.io/ with these parameters
      - a. Maven project
      - b. Language: Java
      - c. Spring boot: 2.6.4
      - d. Group: com.rest
      - e. Artifact: factoria
      - g. Name: factoria
      - h. Description: Demo REST project for Spring Boot
      - i: Packaging: Jar
      - j: Java: 11
      - k: Dependencies: Spring Web
   2. Click on Generate and open it in IntelliJ

2. Clone the repo from https://github.com/Factoria-F5-Git/ApiDesign

## Guided exercise

1. Add a AddController in the namespace com.rest.factoria.controllers
   1. Add the following imports
      ```
      import org.springframework.web.bind.annotation.GetMapping;
      import org.springframework.web.bind.annotation.PostMapping;
      import org.springframework.web.bind.annotation.RestController;
      ```
   2. Add the following annotation to the AddController class
         ```
         @RestController
         public class AddController {
         ```
   3. Create a GET method Hello
         ```
         @GetMapping("hello")
         public String Hello(){
            return "Hello";
         }
         ```
   4. Open PostMan and run a Get Request `http://localhost:8765/hello` verifying that it returns `Hello`
   
## Unguided exercise

1. Extend the Hello endpoint in the AddController class to accept a parameter `name`. The call to `http://localhost:8765/hello?name=James` will have 
to return  `Hello James`
2. Create a new GET endpoint named `total` in the AddController class. 
   1. It will have to return the value of a `totalValue` static int variable that you will have to define within the AddController class. 
      Initialize it to 1.
   2. Make sure the `http://localhost:8765/total` returns 1 via Postman
3. Create a new POST endpoint `add` using the `@PostMapping("add")` annotation. 
   1. Make it accept a `valueToAdd` parameter of type int.
   2. Add `valueToAdd` to total
   3. Using Postman make a POST request to `http://localhost:8765/add` setting the Body parameter `valueToAdd` to 2.
   4. Make sure the `http://localhost:8765/total` returns 3 via Postman



   
   
