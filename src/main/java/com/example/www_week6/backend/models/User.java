package com.example.www_week6.backend.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private long id;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String middleName;
    @Column(length = 50)
    private String lastName;
    @Column(length = 15)
    private String mobile;
    @Column(length = 50)
    private String email;
    @Column(length = 32)
    private String passwordHash;

    private Instant registeredAt;
    private Instant lastLogin;
    private String intro;
    private String profile;

}
