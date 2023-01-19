package com.developperapps.firstap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Data@AllArgsConstructor@NoArgsConstructor
@Entity
public class Supervisor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private  String name;
    @Enumerated(EnumType.STRING)
    private AppRole appRole;

    @OneToMany(fetch = FetchType.LAZY)
    private Collection<Trainee> trainees;
}
