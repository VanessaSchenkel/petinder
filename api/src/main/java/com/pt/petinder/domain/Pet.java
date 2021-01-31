package com.pt.petinder.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "is_dog", nullable = false)
    private boolean isDog;

    @NotNull
    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    @NotEmpty
    private String name;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthdate;

    private String size;

    @NotEmpty
    private String gender;

    @NotEmpty
    private String breed;

    @NotEmpty
    private String bio;

    private LocalDateTime registrationDate;

    @Column(name = "is_vaccinated", nullable = false)
    private boolean isVaccinated;

    @Column(name = "is_castrated", nullable = false)
    private boolean isCastrated;

    @Column(name = "is_dewormed", nullable = false)
    private boolean isDewormed;

    @Column(name = "has_FIVorFELV", nullable = false)
    private boolean hasFIVorFELV;

    @Column(name = "is_dogfriendly", nullable = false)
    private boolean isDogfriendly;

    @Column(name = "is_catfriendly", nullable = false)
    private boolean isCatfriendly;

    @Column(name = "is_childfriendly", nullable = false)
    private boolean isChildfriendly;

    @Column(name = "is_curious", nullable = false)
    private boolean isCurious;

    @Column(name = "is_sociable", nullable = false)
    private boolean isSociable;

    @Column(name = "is_dominant", nullable = false)
    private boolean isDominant;

    @Column(name = "is_playful", nullable = false)
    private boolean isPlayful;

    @Column(name = "is_outgoing", nullable = false)
    private boolean isOutgoing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_human")
    private Human human;

}
