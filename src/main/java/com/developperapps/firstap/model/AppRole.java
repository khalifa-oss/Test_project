package com.developperapps.firstap.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public enum AppRole {
    ADMIN,USER,MANAGER;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
