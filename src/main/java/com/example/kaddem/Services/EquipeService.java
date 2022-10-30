package com.example.kaddem.Services;

import com.example.kaddem.Entity.Departement;
import com.example.kaddem.Entity.Equipe;
import com.example.kaddem.Entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EquipeService {

    List<Equipe> retrieveAllEquipe();

    //Ajouter seulement
    Equipe addEquipe (Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe(Integer idEquipe);

    void removeEquipe(Integer idEquipe);
}
