package com.cydeo.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    private String password;
    private LocalDate birthDate;
    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private int zipCode;

}
