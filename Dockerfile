FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-maven.0.0.1-SNAPSHOT spring-boot-maven.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-maven.0.0.1-SNAPSHOT.jar"]