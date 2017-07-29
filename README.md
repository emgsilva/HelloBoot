## Spring Boot Hello World with Subtitles

Reference Spring Boot Hello World project, with code comments on the most essential/basic parts of a basic Spring Boot project, namely:

- Spring Boot configuration
- Basic REST endpoint/controller
- Example of unit test (using MvcMock)
- Example of an integration test
- Adding production grade services (via actuator module, which provides "out-of-the-box" and without any major configuration  health, audits, etc.)
- Making some changes on default Spring Boot elements (e.g.: use Jetty instead of default Tomcat servlet container)

Running instructions:

```
mvn package && java -jar target/helloboot-0.0.1-SNAPSHOT.jar
```

(This is build based on instructions from the official Spring Boot documentation. The basic project structure was generated using Spring Initializr - https://start.spring.io/, which simplifies the creation of a basic running project with the "ingredients" selected for the project)
