package com.project.User_Management.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message =  "name can't be empty")
    private String name;

    @Email(message = "Enter valid Email")
    @Column(unique = true)
    private String email;

    @NotBlank
    private String password;

}
