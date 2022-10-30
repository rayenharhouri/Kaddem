package com.example.kaddem.Controllers;

import com.example.kaddem.Entity.Equipe;
import com.example.kaddem.Services.EquipeService;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    EquipeService equipeService;

    @GetMapping("/getAll")
    public List<Equipe> getAllEquipe(){
        return equipeService.retrieveAllEquipe();
    }
    @PostMapping("/add")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }

    @PutMapping("/update")
    public Equipe updateEquipe(@RequestBody Equipe equipe){
        return equipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/delete/{idE}")
    public String deleteEquipe(@PathVariable int idE){
        try {
            equipeService.removeEquipe(idE);
            return "done";
        }catch(Exception e)
        {
            return "Failed";
        }
    }

}
