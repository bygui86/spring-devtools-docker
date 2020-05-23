
# Spring DevTools docker

Sample project to understand Spring DevTools for Docker

## Run

### Classical DevTools

1. Run application with IntelliJ IDEA

2. Open a terminal and test the application greeting

    `curl http://localhost:8080`

3. Change (comment/uncomment lines) greeting in `GenericController` without stopping application

4. Rebuild the application in IntelliJ IDEA and wait for Spring DevTools to automatically reload the application without restarting the JVM or else

5. Test the application greeting again

    `curl http://localhost:8080`

6. Verify the greeting return is the new one!

### Docker DevTools

1. Build container image using Maven

    `./mvnw spring-boot:build-image`
    
2. Run application in container

    `docker run --tty --rm --name devtools -p 8080:8080 spring-devtools-docker:0.0.1`

3. Open another terminal and test the application greeting

    `curl http://localhost:8080`

4. Click on `Edit configurations` in IntelliJ IDEA and add a new `Application` with following parameters:

    - name: RemoteSpringApplication
    - main class: org.springframework.boot.devtools.RemoteSpringApplication
    - program arguments: http://localhost:8080
    
    `RemoteSpringApplication` is effectively a file watcher that notifies a running application that its files were changed

5. Start the new `RemoteSpringApplication` application in IntelliJ IDEA 

6. Enable `WorldController` uncommenting `@RestController` annotation

7. Rebuild the application in IntelliJ IDEA and wait for Spring DevTools to automatically reload the application without restarting the JVM, the container or else

8. Test the application greeting again

    `curl http://localhost:8080`

9. Test the application new greeting

    `curl http://localhost:8080/world`

## Links
- https://www.youtube.com/watch?v=1w1Jv9qssqg
