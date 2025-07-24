/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelojDigital;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Reloj {
    
    private LocalTime horaActual;
    private DateTimeFormatter formato;

    public Reloj() {
        this.horaActual = LocalTime.now();
        this.formato = DateTimeFormatter.ofPattern("h:m:s");
    }
    
    public void NuevaHora (){
        this.horaActual = LocalTime.now();
    }
    
    public String validar(){
        return this.horaActual.format(this.formato);
    }

    public LocalTime getHoraActual() {
        return horaActual;
    }

    
    
    
    
}
