package com.thinhgroup.hello_spring_boot.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Schema(description = "User entity representing a registered person in the system.")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the user.", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Full name of the user.", example = "John Doe", required = true)
    private String name;

    @Schema(description = "Email address of the user.", example = "john.doe@example.com", required = true)
    @NotBlank(message = "Name is mandatory")
    @Email(message = "Invalid email format")
    private String email;
}
