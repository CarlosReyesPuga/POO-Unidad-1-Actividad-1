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
public class Operaciones {
    
    public String Resolver_Primera_Parte(String Cadena_Evaluar){
        int Longitud_Cadena = Cadena_Evaluar.length();
        char parte,parte_volatil;
        int j=0;
        String cadena_volatil="";
        for(int i=0; i<Longitud_Cadena;i++){
            parte = Cadena_Evaluar.charAt(i);
            switch(parte){
                case '(':
                    for(int x=i;x<Longitud_Cadena;x++){
                        parte_volatil= Cadena_Evaluar.charAt(x);
                        switch(parte_volatil){
                            case ')':
                                cadena_volatil = cadena_volatil + Character.toString(parte_volatil);
                                x=Longitud_Cadena;
                                i=Longitud_Cadena;
                                break;
                            default:
                                if(x==j){
                                    cadena_volatil = Character.toString(parte_volatil);
                                } else {
                                    cadena_volatil = cadena_volatil + Character.toString(parte_volatil);
                                }
                                break;
                        }
                    }                  
                    break;
                case '[':
                    for(int x=i;x<Longitud_Cadena;x++){
                        parte_volatil= Cadena_Evaluar.charAt(x);
                        switch(parte_volatil){
                            case ']':
                                cadena_volatil = cadena_volatil + Character.toString(parte_volatil);
                                x=Longitud_Cadena;
                                i=Longitud_Cadena;
                                break;
                            default:
                                if(x==j){
                                    cadena_volatil = Character.toString(parte_volatil);
                                } else {
                                    cadena_volatil = cadena_volatil + Character.toString(parte_volatil);
                                }
                                break;
                        }
                    }
                break;
            }
        }

        return cadena_volatil;
    }
    
}