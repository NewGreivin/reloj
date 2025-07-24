/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

/**
 *
 * @author Jonathan
 */
public class Temporizador {
    private int segundosRest;
    private boolean enEjecucion;

    public Temporizador(int segundosRest) {
        this.segundosRest = segundosRest;
        this.enEjecucion = enEjecucion;
    }
    
    public int getSegundosRest() {
        return segundosRest;
    }
     
    public void iniciar(){
        enEjecucion = true;
    }
    
    public void pausar(){
        enEjecucion = false;
    }
    
    public void reiniciar(int newSegundos){
        this.segundosRest = newSegundos;
        this.enEjecucion = false;
    }
    
    public void decrementar(){
        if(enEjecucion && segundosRest > 0){
            segundosRest--;
        }
    }

   public boolean estaenEjecucion(){
       return enEjecucion;
   }
   
}
