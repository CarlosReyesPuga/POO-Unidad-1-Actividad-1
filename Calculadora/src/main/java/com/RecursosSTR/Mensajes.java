/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RecursosSTR;

/**
 *
 * @author carlo
 */
public class Mensajes extends Mensajes_abstractos {
    public void Mensaje_Error_1(){
        System.out.println("Error, al momento de utilizar los parentesis");
    }
    
    public void Mensaje_Error_2(){
        System.out.println("Error, al momento de escribir un numero con punto decimal");
    }
    
    public void Mensaje_Error_3(){
        System.out.println("Error, al momento de escribir una de las siguientes  operadores:");
        System.out.println("sqrt(),sin(),cos(),tan()");
    }
    
    public void Mensaje_Error_4(){
        System.out.println("Error, al momento de utilizar letras no permitidas");
    }
    
    
}
