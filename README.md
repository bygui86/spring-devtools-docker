
# Spring DevTools docker

Sample project to understand Spring DevTools for Docker

## Run

### Classical DevTools

1. Run application with IntelliJ IDEA

2. Open a terminal and test the application greeting

    `curl http://localhost:8080`

3. Change (comment/uncomment lines) greeting in `GenericController` without stopping application

4. Wait a bit for IntelliJ IDEA to rebuild and Spring DevTools to reload the application

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

    - name: remote SpringDevtoolsDockerApplication
    - main class: com.rabbit.samples.springdevtoolsdocker.SpringDevtoolsDockerApplication
    - program arguments: http://localhost:8080

5. Start the new `remote SpringDevtoolsDockerApplication` application in IntelliJ IDEA

6. Test the application greeting again

    `curl http://localhost:8080`

7. Enable `WorldController` uncommenting `@RestController` line

8. Wait a bit for IntelliJ IDEA to rebuild and Spring DevTools to reload the application but in container

9. Test the application new greeting

    `curl http://localhost:8080/world`

## Links
- https://www.youtube.com/watch?v=1w1Jv9qssqg
