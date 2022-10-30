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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEtdiant;
    String nomEtudiant;
    String prenomEtudiant;
    @Enumerated(EnumType.STRING)
    Domain domain;

    @ManyToMany(mappedBy = "etudiants")
    Set<Equipe> equipes;
    @ManyToOne
    Contrat contrat;
    @ManyToOne
    Departement departement;

}
