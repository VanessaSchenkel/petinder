package com.pt.petinder.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "password_user", nullable = false)
    private String password;

    @Email
    @NotEmpty
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotEmpty
    @Column(name = "name_user", nullable = false)
    private String name;

    private int telephone;

    private LocalDateTime registrationDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address")
    private Address address;

}
