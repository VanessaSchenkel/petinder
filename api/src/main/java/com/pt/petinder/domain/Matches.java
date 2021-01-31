package com.pt.petinder.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Matches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "match_date", nullable = false)
    private LocalDateTime matchDate;

    @NotNull
    @Column(name = "is_adopted", nullable = false)
    private boolean isAdopted;

    @NotNull
    @Column(name = "has_seen", nullable = false)
    private boolean hasSeen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_human")
    private Human human;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pet")
    private Pet pet;

}
