import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostrarMedicosComponent } from './mostrar-medicos.component';

describe('MostrarMedicosComponent', () => {
  let component: MostrarMedicosComponent;
  let fixture: ComponentFixture<MostrarMedicosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MostrarMedicosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MostrarMedicosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
