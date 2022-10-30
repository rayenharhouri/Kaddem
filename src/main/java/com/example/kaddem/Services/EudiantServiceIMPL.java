package com.example.kaddem.Services;

import com.example.kaddem.Entity.Departement;
import com.example.kaddem.Entity.Domain;
import com.example.kaddem.Entity.Etudiant;
import com.example.kaddem.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EudiantServiceIMPL implements EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
    @Override
    public Etudiant addAndAssignEtudiant(Etudiant e, Departement id) {

        return null;
    }
    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }
    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }
    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
