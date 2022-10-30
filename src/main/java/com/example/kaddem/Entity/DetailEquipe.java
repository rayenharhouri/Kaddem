package com.example.kaddem.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idDetailEquie;
    int salle;
    String thematique;
    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
