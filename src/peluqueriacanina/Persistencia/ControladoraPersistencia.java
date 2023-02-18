package peluqueriacanina.Persistencia;

import peluqueriacanina.Logica.Duenio;
import peluqueriacanina.Logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
    
    duenioJpa.create(duenio);
    
    mascoJpa.create(masco);
    }
}
