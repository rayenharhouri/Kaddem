package com.example.kaddem.Entity;


import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idContrat;
    Date dateDebutContrat;
    Date dateFinContrat;
    Specialite specialite;
    boolean archive;
    @OneToMany(mappedBy = "contrat")
    Set<Etudiant> etudiants;
}
