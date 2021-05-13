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
public class Prioridad {
    
    public int Prioridad1(String Cadena_Evaluar){
        int Longitud_De_Cadena = Cadena_Evaluar.length();
        int Numero_De_Corchetes=0,Numero_De_Parentesis=0,Verificacion=0;
        char partes;
        for(int i=0; i<Longitud_De_Cadena;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case '[':
                    Numero_De_Corchetes++;
                    break;
                case ']':
                    Numero_De_Corchetes++;
                    break;
                case '(':
                    Numero_De_Parentesis++;
                    break;
                case ')':
                    Numero_De_Parentesis++;
                    break;
            }
        }
        
        if((Numero_De_Corchetes%2)==0 && (Numero_De_Parentesis%2)==0){
            Verificacion=1;
        }
        
        return  Verificacion;
    }
    
    public int Prioridad2(String Cadena_Evaluar){
        int Longitud_De_Cadena = Cadena_Evaluar.length();
        int Numero_De_Elevacion=0,Verificacion=0,Numero_De_Raiz=0,j;
        char partes,Letra_buscada_q,Letra_buscada_r,Letra_buscada_t;
        for(int i=0; i<Longitud_De_Cadena;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case '^':
                    Numero_De_Elevacion++;
                    break;
            }
        }
        
        for(int i=0; i<Longitud_De_Cadena; i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case 's':
                    j=i+1;
                    Letra_buscada_q=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_r=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_t=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_q=='q' && Letra_buscada_r=='r' && Letra_buscada_t == 't'){
                        Numero_De_Raiz++;
                        i=j;
                    }
                    break;
            }
        }
        
        if(Numero_De_Elevacion!=0 || Numero_De_Raiz!=0){
            Verificacion++;
        }
        
        return Verificacion;
    }
    
    public int Prioridad3(String Cadena_Evaluar){
        int Longitud_De_Cadena = Cadena_Evaluar.length();
        int Numero_De_Multiplicacion=0,Numero_De_Division=0,Verificacion=0,Numero_De_Seno=0,Numero_De_Coseno=0,Numero_De_Tangente=0,j;
        char partes,Letra_buscada_i,Letra_buscada_n,Letra_buscada_o,Letra_buscada_s,Letra_buscada_a;
        for(int i=0; i<Longitud_De_Cadena;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case '/':
                    Numero_De_Multiplicacion++;
                    break;
                case '*':
                    Numero_De_Division++;
                    break;
            }
        }
        
        for(int i=0; i<Longitud_De_Cadena; i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case 's':
                    j=i+1;
                    Letra_buscada_i=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_n=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_i=='i' && Letra_buscada_n=='n'){
                        Numero_De_Seno++;
                        i=j;
                    }
                    break;
                case 'c':
                    j=i+1;
                    Letra_buscada_o=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_s=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_o=='o' && Letra_buscada_s=='s'){
                        Numero_De_Coseno++;
                        i=j;
                    }
                    break;
                case 't':
                    j=i+1;
                    Letra_buscada_a=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_n=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_a=='a' && Letra_buscada_n=='n'){
                        Numero_De_Tangente++;
                        i=j;
                    }
                    break;
            }
        }
        
        if(Numero_De_Multiplicacion!=0 || Numero_De_Division!=0 || Numero_De_Seno!=0 || Numero_De_Coseno!=0 || Numero_De_Tangente!=0){
            Verificacion++;
        }
        
        return Verificacion;
    }
    
    public int Prioridad4(String Cadena_Evaluar){
        int Longitud_De_Cadena = Cadena_Evaluar.length();
        int Numero_De_Suma=0,Numero_De_Resta=0,Verificacion=0;
        char partes;
        for(int i=0; i<Longitud_De_Cadena;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case '+':
                    Numero_De_Suma++;
                    break;
                case '-':
                    Numero_De_Resta++;
                    break;
            }
        }
        
        if(Numero_De_Suma!=0 || Numero_De_Resta!=0){
            Verificacion++;
        }
        
        return Verificacion;
    }
}
