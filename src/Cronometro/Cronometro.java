/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cronometro;

/**
 *
 * @author Ricardo Chaves
 */
public class Cronometro {
    private int segundostranscurrido;
    private boolean ejecucion;

    public int getSegundostranscurrido() {
        return segundostranscurrido;
    }
    
    public boolean ejecucion(){
        return ejecucion;    
    }
    
    //constructor
    public Cronometro() {
        this.segundostranscurrido = 0;
        this.ejecucion = false;
    }
    
    //metodos

    public void iniciar(){
        this.ejecucion=true;
    }
    
    public void pausar(){
        this.ejecucion=false;
    }
    
    public void reiniciar(){
        this.segundostranscurrido=0;
        this.ejecucion=false;
    }
    
    
    //Formato
    
    public String obtenerformatoHHMMSS(){
        int horas = segundostranscurrido / 3600;
        int minutos = (segundostranscurrido % 3600) / 60;
        int segundos = segundostranscurrido % 60;
    
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    } 
    
    
    
}


