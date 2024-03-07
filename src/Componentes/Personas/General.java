/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes.Personas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author danie
 */
public class General extends Persona{
public static final int PESO_GENERAL = 1;    
    public General(){
        super();
        Random random = new Random(); 
        setMultiplicador(random.nextFloat(2, 3));   
        setPeso(PESO_GENERAL);        
        ArrayList<Integer> atributos = generarAtributos(100);
        setAtaque((int) Math.ceil(atributos.get(0)*getMultiplicador()));
        setDefensa((int) Math.ceil(atributos.get(1)*getMultiplicador()));
        setSalud((int) Math.ceil(atributos.get(2)*getMultiplicador())); 
//        setNombre(LLAMAR A FUNCION QUE DEVUELVE NOMBRE RANDOM DESDE FICHERO);
    }

    public General(String nombreGeneral) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    @Override
public String toString() {
        return "General {" +
                "Nombre='" + this.getNombre() + '\'' +
                ", Ataque='" + this.getAtaque() + '\'' +
                ", Defensa='" + this.getDefensa() + '\'' +
                ", Salud='" + this.getSalud() + '\'' +                
                ", Peso='" + this.getPeso() + '\'' +
                '}';
    }     
}
