FROM eclipse-temurin:21
LABEL mentainer="javaguides.net@gmail.com"
WORKDIR /app
COPY target/springboot-restful-webservice-0.0.1-SNAPSHOT.jar /app/springboot-restful-webservice.jar
ENTRYPOINT ["java", "-jar", "springboot-restful-webservice.jar"]