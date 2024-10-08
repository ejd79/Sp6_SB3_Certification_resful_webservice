package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title = "Spring Boot REST API Documentation",
                description = "Spring Boot REST API Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Erick",
                        email = "erickjd79@gmail.com",
                        url = "linkedin.com/in/erickjeronimo"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.javaguides.net/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Managment Documentation",
                url = "http://www.javaguides.net/user_management.html"
        )
)
public class SpringbootRestfulWebserviceApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestfulWebserviceApplication.class, args);
    }

}
