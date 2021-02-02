package com.pt.petinder.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "path_picture", nullable = false)
    private String path;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pet")
    private Pet pet;

}
