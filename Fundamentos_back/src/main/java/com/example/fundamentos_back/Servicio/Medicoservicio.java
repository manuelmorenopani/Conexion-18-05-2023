package com.example.fundamentos_back.Servicio;

import com.example.fundamentos_back.Modelo.Medico;
import com.example.fundamentos_back.Repositorio.IDMedicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Medicoservicio implements IMedicoServicio {
    @Autowired
    IDMedicoRepo medicoR;

    public Medico[] obtener(Medico medico){
        return medicoR.obtener(medico);
    };


}
