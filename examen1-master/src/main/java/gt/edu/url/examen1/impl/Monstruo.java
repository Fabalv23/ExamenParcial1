/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.*;
/**
 *
 * @author tuxtor
 */
public class Monstruo implements FabricaRanger{

     private String Nombre;
    private String Elemento;
    private int Edad;
    private String Color;
    /**
     * Crea las listas para la manipulacion
     */
    private Monstruo[] coreP ;
    //private Monstruo[] coreC;
    private int count=0;
    private int t=-1;
    
    /**
     * Este metodo realiza la construccion de las listas necesarias para la manipulacion de los monstruos
     * @param size 
     */
 /*  public Monstruo(){
        
        for (int i = 0; i < ; i++) {
              
            coreP[i]=null;
            
        }
        
        count = 0;
    }
    */
      /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Elemento
     */
    public String getElemento() {
        return Elemento;
    }

    /**
     * @param Elemento the Elemento to set
     */
    public void setElemento(String Elemento) {
        this.Elemento = Elemento;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public String Agigantar(){
         
         return "soy "+Nombre+"y me agiganto";
     }
     
     public String Caminar_Lento(){
         return "soy "+Nombre+"y camino lento";
     }
     
     public String Golpear(){
         return "Soy "+Nombre+" y estoy golpeando";
     }
    
    public String Volar(){
         if (Elemento == "Aire") {
                  
        return "Soy "+Nombre+" y estoy volando";
         }else{
         return "Soy "+Nombre+" y no estoy volando";
         }
         
         
         
    }
    
    public String Quemar(){
         if (Elemento == "Fuego") {
                  
        return "Soy "+Nombre+" y estoy quemando";
         }else{
         return "Soy "+Nombre+" y no estoy quemando";
         }
    }
    
    /**
     * Sirve para poder imprimir de una vez todo lo que es posible para imprimir de poderes
     */
    @Override
    public void hacerAlgo() {
        
        
        
        System.out.println(Agigantar());
        System.out.println(Caminar_Lento());
        System.out.println(Golpear());
        System.out.println(Quemar());
        System.out.println(Volar());
           
    }

    /**
     * Buscar la primera pila vacia
     * @param monstruo
     * @return 
     */
    @Override
    public boolean apilar(Monstruo monstruo) {
        
        
       coreP[count]= monstruo;   
            count++;
      return true;  
       
        
        
    }
/**
 * Saca lo ultimo insertado en la pila con un -1 del length original
 * @param monstruo
 * @return 
 */
    @Override
    public boolean desapilar(Monstruo monstruo) {
        
        Monstruo elemento = coreP[count-1];
        
        if (coreP[count-1]!=null) {
            coreP[count-1] = null;
            return true;
        }else{
            System.out.println("indice invalido");
            return false;
        }
     
         
        
        
        
        
    }

    /**
     * si el contador es 0 incerta en la primera vacia
     * @param monstruo
     * @return 
     */
    @Override
    public boolean encolar(Monstruo monstruo) {
    
        if (count ==0) {
            coreP[count]=monstruo;
      return true;  
        }else  {
            System.out.println("Cola llena");
            return false;
        }
        
     
    }

    /**
     * Sigue los parametros para desencolar
     * @param monstruo
     * @return 
     */
    @Override
    public boolean desencolar(Monstruo monstruo) {
        Monstruo elemento = coreP[0];
        
        if (coreP[0]!=null) {
            coreP[0] = null;
            return true;
        }else{
            System.out.println("No hay nada en la pila");
            return false;
        }
    }
/**
 * Solo quita variables por defecto y deja el elemento
 * @param elemento
 * @return 
 */
    @Override
    public Monstruo fabricar(String elemento) {
        
      Monstruo f1 = new Monstruo();
      
      f1.setColor("");
      f1.setEdad(0);
      f1.setNombre("");
      f1.setElemento(elemento);
      
      System.out.println("Monstruo creado de " + f1.getElemento());
      
      return f1;
              

    }

    
}
