package com.developperapps.firstap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ValueGenerationType;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Collection;

@Data@AllArgsConstructor@NoArgsConstructor
@Entity
public class AppUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Collection<AppRole> appRole;

}
