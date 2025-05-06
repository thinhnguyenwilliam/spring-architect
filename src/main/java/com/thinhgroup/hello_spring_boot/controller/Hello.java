package com.thinhgroup.hello_spring_boot.controller;

import com.thinhgroup.hello_spring_boot.entity.User;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Hello Controller", description = "API for greeting")
public class Hello
{

    @Operation(
            summary = "Retrieve all users",
            description = "Fetches a list of all users stored in the database.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "List of users retrieved successfully",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
            }
    )
    @GetMapping( "/v1/api/hello")
    public String hello()
    {
        return "Hello World!";
    }

}
