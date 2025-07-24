/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelojDigital;

import Intefaces.Configurable;

/**
 *
 * @author Ricardo Chaves
 */
public class Reloj2 extends Tiempo implements Configurable {

    @Override
    public void configurar(int horas, int minutos, int segundos) {
        this.hora=horas;
        this.minuto=minutos;
        this.segundo=segundos;
    }
    
}
