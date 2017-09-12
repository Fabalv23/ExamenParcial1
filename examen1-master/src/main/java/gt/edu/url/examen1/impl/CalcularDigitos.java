/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.*;
/**
 *
 * @author fabia
 */
public class CalcularDigitos implements Chudnovsky{
    /**
     * Realiza el factorial de cualquie numero recibiendo como parametro una letra k
     * @param k
     * @return 
     */
    public int Factorial(int k) {
        
        
        if (k == 0) {
            return 1;
        }else{
            
            return (k * Factorial(k - 1));      // Metodo utilizando recursividad
        }
            
        
    }
    
    /**
     * 
     * En este recibe el mismo valor k para realizar la suma de los valores de k=0 hasta el valor k ingresado
     * @param k
     * @return 
     */
    
    @Override
    public double calcularPi(int k) {
        
       
        
        
          
    double constante=(-2.625374126 * (Math.pow(10,17))); // Constante escrita para que se soportara en un tipo de dato
        if (k==0) {
            return 13591409;
        }else {
            return ((Factorial(6*(k-1))) * ((545140134*(k-1))+(13591409))/(Factorial(3*(k-1)) * Math.pow(((Factorial(k-1))), 3) * Math.pow(constante,k-1)));
        }
    
   
        
     
      
        
        

    }
    
  
}

    
    

