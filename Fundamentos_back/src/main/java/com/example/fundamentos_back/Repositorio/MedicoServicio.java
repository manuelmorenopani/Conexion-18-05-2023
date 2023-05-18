package com.example.fundamentos_back.Repositorio;

import com.example.fundamentos_back.Modelo.Medico;
import org.springframework.stereotype.Repository;
@Repository
public class MedicoServicio implements IDMedicoRepo{

        @Override
        public Medico[] obtener(Medico medico) {
            Medico[] medicos= {
                    new Medico(1234123,"Manuel",123456789),
                    new Medico(4567890,"Luisa",987654321),
            };
            return medicos;
        }
}

