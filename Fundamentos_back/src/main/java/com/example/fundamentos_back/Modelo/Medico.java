package com.example.fundamentos_back.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Medico {
    int id;
    String nombre;
    int edad;
}
