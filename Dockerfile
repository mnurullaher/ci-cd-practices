FROM openjdk:17-alpine3.14
WORKDIR /app
COPY target/CI-CD-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]