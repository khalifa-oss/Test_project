package com.developperapps.firstap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
public class Trainee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String password;
    private String email;
    private Date birthDate;
    @Enumerated(EnumType.STRING)
    private Collection<AppRole> appRole;
    @ManyToOne()
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;



}
