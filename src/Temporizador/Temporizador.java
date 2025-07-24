/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

import Intefaces.Configurable;
import Intefaces.Controlable;
import RelojDigital.Tiempo;

/**
 *
 * @author Jonathan
 */
public class Temporizador extends Tiempo implements Configurable, Controlable{

    @Override
    public void configurar(int horas, int minutos, int segundos) {
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }

    @Override
    public void iniciar() {
        this.activo = true;
    }

    @Override
    public void detener() {
        this.activo = false;
    }

    @Override
    public void correr() {
         if (this.activo){
            segundo--;
            if(segundo==-1) {
               segundo=59;
               minuto--;
                if(minuto==-1) {
                   minuto=59;
                   hora--;
                    if(hora==-1){
                        hora=0;
                        minuto=0;
                        segundo=0;
                        this.activo = false;
                    }
                }
            }
         }
    }   
}