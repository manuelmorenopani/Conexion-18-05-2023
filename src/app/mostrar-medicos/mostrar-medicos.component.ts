import { Component } from '@angular/core';
import { Medico } from 'src/modelos/Listamedico';
import { MedicosService } from '../medicos.service';
@Component({
  selector: 'app-mostrar-medicos',
  templateUrl: './mostrar-medicos.component.html',
  styleUrls: ['./mostrar-medicos.component.css']
})
export class MostrarMedicosComponent {
  medico : Medico [] = []

  constructor(private sercio:MedicosService){

  }
  ngOnInit(): void{
    this.sercio.listar().subscribe(datos => this.medico=datos);
    
  }


}
