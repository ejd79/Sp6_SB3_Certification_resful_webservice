package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDTO model information"
)
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @Schema(
            description = "User First Name"
    )
    // User first name should not be null or empty
    @NotEmpty(message = "User First Name should not be null or empty")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    // User last name should not be null or empty
    @NotEmpty(message = "User Last Name should not be null or empty")
    private String lastName;

    @Schema(
            description = "User Email Address"
    )
    // User email should not be null or empty
    // Email address should be valid
    @NotEmpty(message = "User Email should not be null or empty")
    @Email
    private String email;
}
