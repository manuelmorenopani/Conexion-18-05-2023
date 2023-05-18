package com.example.fundamentos_back.Controlador;

import com.example.fundamentos_back.Modelo.Medico;
import com.example.fundamentos_back.Servicio.Medicoservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired

    private Medicoservicio p;
    @GetMapping
    public List<Medico> obtener(Medico medico){
        return List.of(p.obtener(medico));
    }


}
