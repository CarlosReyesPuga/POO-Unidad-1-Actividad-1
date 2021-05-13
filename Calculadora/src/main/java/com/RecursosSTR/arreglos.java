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
public class arreglos {
    
    
    public int Buscar_x(String Cadena_Evaluar){    
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes;
        int Encontro_x=0;
        for(int i=0; i<Longitud_Cadena_Evaluar;i++){
            partes = Cadena_Evaluar.charAt(i);
            switch(partes){
                case 'x':
                    Encontro_x=1;
                    break;
            }
        }
        return Encontro_x;
    }
    
    public String Modificar_x(String Cadena_Evaluar, String Valor){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes,parte_anterior;
        int j;
        String Ecuacion_Modificada="";
        for(int i=0; i<Longitud_Cadena_Evaluar;i++){
            partes = Cadena_Evaluar.charAt(i);
            switch(partes){
                case 'x':
                    if(i==0){
                        Ecuacion_Modificada=Valor;
                    } else {
                        j=i-1;
                        parte_anterior = Cadena_Evaluar.charAt(j);
                        if(parte_anterior=='+' || parte_anterior=='-' || parte_anterior=='*' || parte_anterior=='/' || parte_anterior=='^'){
                            Ecuacion_Modificada = Ecuacion_Modificada + Valor;
                        }else {
                            Ecuacion_Modificada = Ecuacion_Modificada + "*" + Valor;
                        }
                    }
                    break;
                default:
                    if(i==0){
                        Ecuacion_Modificada = Character.toString(partes);
                    } else {
                        Ecuacion_Modificada =  Ecuacion_Modificada + Character.toString(partes);
                    }
                    break;
            }
        }
        
        return Ecuacion_Modificada;
    }
    
    public int Problemas_De_Parentesis(String Cadena_Evaluar){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes,parte_Restante,parte_Buscar,parte_Buscar_2,parte_Terminar_Parentesis;
        int error=0,j,x;
        
        for(int i=0; i<Longitud_Cadena_Evaluar;i++){
            partes = Cadena_Evaluar.charAt(i);
            switch(partes){
                case '(':
                    j=i+1;
                    parte_Restante = Cadena_Evaluar.charAt(j);
                    
                    switch(parte_Restante){
                        case ')':
                            error=1;
                            i=j;
                            break;
                        case '-':
                            x=j+1;
                            parte_Buscar = Cadena_Evaluar.charAt(x);
                            x++;
                            parte_Buscar_2 = Cadena_Evaluar.charAt(x);
                            if( parte_Buscar==')' || parte_Buscar=='+' || parte_Buscar=='*' || parte_Buscar=='/' || parte_Buscar=='-'){
                                error=1;
                            }
                            for(int b=j;b<Longitud_Cadena_Evaluar;b++){
                                parte_Terminar_Parentesis = Cadena_Evaluar.charAt(b);
                                if(parte_Terminar_Parentesis==')'){
                                    i=b;
                                    b=Longitud_Cadena_Evaluar;
                                }
                            }
                            break;
                        case '+':
                            x=j+1;
                            parte_Buscar = Cadena_Evaluar.charAt(x);
                            x++;
                            parte_Buscar_2 = Cadena_Evaluar.charAt(x);
                            if( (parte_Buscar=='0' && parte_Buscar_2 ==')' ) || parte_Buscar==')' || parte_Buscar=='+' || parte_Buscar=='*' || parte_Buscar=='/' || parte_Buscar=='-' ){
                                error=1;
                            }
                            for(int b=j;b<Longitud_Cadena_Evaluar;b++){
                                parte_Terminar_Parentesis = Cadena_Evaluar.charAt(b);
                                if(parte_Terminar_Parentesis==')'){
                                    i=b;
                                    b=Longitud_Cadena_Evaluar;
                                }
                            }
                            break;
                        case '*':
                            error=1;
                            for(int b=j;b<Longitud_Cadena_Evaluar;b++){
                                parte_Terminar_Parentesis = Cadena_Evaluar.charAt(b);
                                if(parte_Terminar_Parentesis==')'){
                                    i=b;
                                    b=Longitud_Cadena_Evaluar;
                                }
                            }
                            break;
                        case '/':
                            for(int b=j;b<Longitud_Cadena_Evaluar;b++){
                                parte_Terminar_Parentesis = Cadena_Evaluar.charAt(b);
                                if(parte_Terminar_Parentesis==')'){
                                    i=b;
                                    b=Longitud_Cadena_Evaluar;
                                }
                            }
                           error=1;
                            break;
                    }
                    break;
                    
                case ')':
                    error=1;
                    break;
            }
        }
        if(error==1){
            Mensajes Mensaje_Mostrado = new Mensajes();
            Mensaje_Mostrado.Mensaje_Error_1();
        }
        return error;
    }
    
    public int Problemas_numero_decimal(String Cadena_Evaluar){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes,partes_decimal;
        int j,ceros_encontrados=0,error=0;
        
        for(int i=0; i<Longitud_Cadena_Evaluar;i++){
            partes = Cadena_Evaluar.charAt(i);
            switch(partes){
                case '.':
                    j=i+1;
                    for(int h=j; h<Longitud_Cadena_Evaluar;h++){
                        partes_decimal= Cadena_Evaluar.charAt(h);
                        switch(partes_decimal){
                            case '+':
                                    if(ceros_encontrados==0){
                                        error=1;
                                    }
                                break;
                            case '-':
                                if(ceros_encontrados==0){
                                    error=1;
                                    }
                                break;
                            case '/':
                                if(ceros_encontrados==0){
                                    error=1;
                                    }
                                break;
                            case '*':
                                if(ceros_encontrados==0){
                                    error=1;
                                    }
                                break;
                            case '0':
                                ceros_encontrados++;
                                break;
                        }
                    }
                    break;
            }
        }
        if(error==1){
            Mensajes Mensaje_Mostrado = new Mensajes();
            Mensaje_Mostrado.Mensaje_Error_2();
        }
        
        
        return error;
    }
    
    public int Errores_De_Funciones_Sin_Simbolos_Error_Escritura(String Cadena_Evaluar){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes,Letra_buscada_i,Letra_buscada_n,Letra_buscada_o,Letra_buscada_s,Letra_buscada_a,Letra_buscada_q,Letra_buscada_r,Letra_buscada_t;
        int j,error=0;
        for(int i=0; i<Longitud_Cadena_Evaluar; i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case 's':
                    j=i+1;
                    Letra_buscada_i=Cadena_Evaluar.charAt(j);
                    Letra_buscada_q=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_n=Cadena_Evaluar.charAt(j);
                    Letra_buscada_r=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_i!='i' || Letra_buscada_n!='n'){
                        error=1;
                        i=j;
                    }
                    j++;
                    Letra_buscada_t=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_q !='q' || Letra_buscada_r !='r' || Letra_buscada_t !='t'){
                        error=1;
                        i=j;
                    }
                    break;
                case 'c':
                    j=i+1;
                    Letra_buscada_o=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_s=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_o!='o' || Letra_buscada_s!='s'){
                        error=1;
                        i=j;
                    }
                    break;
                case 't':
                    j=i+1;
                    Letra_buscada_a=Cadena_Evaluar.charAt(j);
                    j++;
                    Letra_buscada_n=Cadena_Evaluar.charAt(j);
                    if(Letra_buscada_a!='a' || Letra_buscada_n!='n'){
                        error=1;
                        i=j;
                    }
                    break;
            }
        }
        
        if(error==1){
            Mensajes Mensaje_Mostrado = new Mensajes();
        Mensaje_Mostrado.Mensaje_Error_3();
        }
        
        return error;
    }
    
    public int Error_Utilizando_Letras_No_Permitidas(String Cadena_Evaluar){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes;
        int error=0;
        for(int i=0; i<Longitud_Cadena_Evaluar;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case 's':
                    break;
                case 'q':
                    break;
                case 'r':
                    break;
                case 't':
                    break;
                case 'i':
                    break;
                case 'n':
                    break;
                case 'c':
                    break;
                case 'o':
                    break;
                case 'a':
                    break;
                case 'x':
                    break;
                default:
                    error=1;
                    break;
            }
        }
        
        Mensajes Mensaje_Mostrado = new Mensajes();
        Mensaje_Mostrado.Mensaje_Error_4();
        
        return error;
    }
    
    public int Errores_De_Funciones_Sin_Simbolos_Error_Al_Resolver(String Cadena_Evaluar){
        int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
        char partes,partes_checar,partes_checar_punto,partes_checar_sin_punto;
        int error=0,j;
        for(int i=0;i<Longitud_Cadena_Evaluar;i++){
            partes=Cadena_Evaluar.charAt(i);
            switch(partes){
                case  '/':
                    j=i+1;
                    partes_checar=Cadena_Evaluar.charAt(j);
                    if(partes_checar=='0'){
                        j++;
                        partes_checar=Cadena_Evaluar.charAt(j);
                        for(int x=j; x<Longitud_Cadena_Evaluar;x++){
                                partes_checar_sin_punto = Cadena_Evaluar.charAt(x);
                                switch(partes_checar_sin_punto){
                                    case '+':
                                        error=1;
                                        break;
                                    case '-':
                                        error=1;
                                        break;
                                    case '*':
                                        error=1;
                                        break;
                                    case '/':
                                        error=1;
                                        break;
                                }
                            }
                    }
                    break;
            }
        }
        
        
        return error;
    }
    
    public int Errores_De_Funciones_Con_Simbolos_En_Posicion_Incorrecta(String Cadena_Evaluar){
            int Longitud_Cadena_Evaluar = Cadena_Evaluar.length();
            char parte,siguiente_parte;
            int error=0,j;
            for(int i=0; i<Longitud_Cadena_Evaluar;i++){
                parte=Cadena_Evaluar.charAt(i);
                switch(parte){
                    case '^':
                        j=i+1;
                        siguiente_parte=Cadena_Evaluar.charAt(i);
                        switch(siguiente_parte){
                            case '^':
                                error=1;
                                break;
                            case '*':
                                error=1;
                                break;
                            case '/':
                                error=1;
                                break;
                            case '+':
                                error=1;
                                break;
                            case '-':
                                error=1;
                                break;
                        }
                    case '*':
                        j=i+1;
                        siguiente_parte=Cadena_Evaluar.charAt(i);
                        switch(siguiente_parte){
                            case '^':
                                error=1;
                                break;
                            case '*':
                                error=1;
                                break;
                            case '/':
                                error=1;
                                break;
                            case '+':
                                error=1;
                                break;
                            case '-':
                                error=1;
                                break;
                        }
                    case '/':
                        j=i+1;
                        siguiente_parte=Cadena_Evaluar.charAt(i);
                        switch(siguiente_parte){
                            case '^':
                                error=1;
                                break;
                            case '*':
                                error=1;
                                break;
                            case '/':
                                error=1;
                                break;
                            case '+':
                                error=1;
                                break;
                            case '-':
                                error=1;
                                break;
                        }
                    case '+':
                        j=i+1;
                        siguiente_parte=Cadena_Evaluar.charAt(i);
                        switch(siguiente_parte){
                            case '^':
                                error=1;
                                break;
                            case '*':
                                error=1;
                                break;
                            case '/':
                                error=1;
                                break;
                            case '+':
                                error=1;
                                break;
                            case '-':
                                error=1;
                                break;
                        }
                    case '-':
                        j=i+1;
                        siguiente_parte=Cadena_Evaluar.charAt(i);
                        switch(siguiente_parte){
                            case '^':
                                error=1;
                                break;
                            case '*':
                                error=1;
                                break;
                            case '/':
                                error=1;
                                break;
                            case '+':
                                error=1;
                                break;
                            case '-':
                                error=1;
                                break;
                        }
                }
            }
        return error;
    }
}
