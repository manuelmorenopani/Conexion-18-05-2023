import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Medico } from 'src/modelos/Listamedico';

@Injectable({
  providedIn: 'root'
})
export class MedicosService {
  Url: string = "http://localhost:8080/medicos";

  constructor(private http: HttpClient) { }

  listar(): Observable<Medico[]> {
    return this.http.get<Medico[]>(this.Url);
  }
}
