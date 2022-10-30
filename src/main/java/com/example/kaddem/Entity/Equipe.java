package com.example.kaddem.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEquipe;
    String nomEquipe;
    Niveau niveau;
    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany
    Set<Etudiant> etudiants;
}

