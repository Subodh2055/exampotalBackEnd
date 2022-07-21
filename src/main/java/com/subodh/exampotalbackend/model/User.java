package com.subodh.exampotalbackend.model;

import jakarta.persistence.*;

import lombok.*;

/**
 * @author Subodh Bhandari
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private boolean enable = true;


}
