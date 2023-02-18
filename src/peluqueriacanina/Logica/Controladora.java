package peluqueriacanina.Logica;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import peluqueriacanina.Persistencia.ControladoraPersistencia;

public class Controladora {
   ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 

    public void guardar(String nombreMasco, String raza, String color, String Observaciones, String alergico, String atenEsp, String nombreDuenio, String CelDuenio) {
    
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(CelDuenio);
        
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(Observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
        
        JOptionPane optionPane = new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        
    }
}
