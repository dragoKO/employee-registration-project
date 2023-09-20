package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


    @NotNull
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    private String password;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private int zipCode;

}
