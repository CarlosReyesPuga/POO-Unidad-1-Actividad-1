/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RecursosSTR;

import java.text.DecimalFormat;

/**
 *
 * @author carlo
 */
public class Operadores extends Operaciones{
    
    public String Suma(String Cadena_analizar){
        int Longitud_de_Cadena_analizar = Cadena_analizar.length();
        char partes;
        int cont=0,con=0;
        String Numero1="",Numero2="",Cadena_suma="",resultado_Final="";
        
        for(int i=0;i<Longitud_de_Cadena_analizar;i++){
            partes = Cadena_analizar.charAt(i);
            
            switch(partes){
                case '+':
                    con=0;
                    cont++;
                    break;
                default:
                    switch(cont){
                        case 0:
                            switch(con){
                                case 0:
                                    Numero1=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero1 = Numero1 + Character.toString(partes);
                                    break;
                            }
                            break;
                        case 1:
                            switch(con){
                                case 0:
                                    Numero2=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero2 = Numero2 + Character.toString(partes);
                                    break;
                            }
                            break;
                    }
                    
                    break;
            }
        
        }
        
        int Longitud_Cadena1 = Numero1.length();
        int Longitud_Cadena2 = Numero2.length();
        int Numeros_en_decimal=0;
        
        for(int i=0;i<Longitud_Cadena1;i++){
            partes = Numero1.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        for(int i=0;i<Longitud_Cadena2;i++){
            partes = Numero2.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        
        switch(Numeros_en_decimal){
            case 0:
                int Numero_1_Entero = Integer.parseInt(Numero1);
                int Numero_2_Entero = Integer.parseInt(Numero2);
                int Suma_Entero = Numero_1_Entero + Numero_2_Entero;
                resultado_Final=String.valueOf(Suma_Entero);
                break;
            case 1:
                double Numero_1_Decimal= Double.parseDouble(Numero1);
                double Numero_2_Decimal= Double.parseDouble(Numero2);
                double Suma_Decimal = Numero_1_Decimal + Numero_2_Decimal;
                DecimalFormat formato = new DecimalFormat("#.00");
                resultado_Final = formato.format(Suma_Decimal);
                int Contador_Para_Final=0,Contador_De_Ceros=0;
        
                int Longitud_resultado_Final = resultado_Final.length();
        
                for(int i=0; i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
            
                    if(partes == '.'){
                        Contador_Para_Final++;
                    }
            
                    switch(Contador_Para_Final){
                         case 1:
                            if(partes ==  '0'){
                                Contador_De_Ceros++;
                            }
                         break;
                    }
                }
        
                if(Contador_De_Ceros == 2){
                    int contador_Final=0,contador_Suma=0;
                    String resultado_Final_Arreglado = "";
                    for(int i=0;i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
                    switch(partes){
                        case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
                
        }
        
        return resultado_Final;
    }
    
    public String Resta(String Cadena_analizar){
        int Longitud_de_Cadena_analizar = Cadena_analizar.length();
        char partes;
        int cont=0,con=0;
        String Numero1="",Numero2="",Cadena_suma="",resultado_Final="";
        
        for(int i=0;i<Longitud_de_Cadena_analizar;i++){
            partes = Cadena_analizar.charAt(i);
            
            switch(partes){
                case '-':
                    if(i!=0){
                    con=0;
                    cont++;
                    }
                    break;
                default:
                    switch(cont){
                        case 0:
                            switch(con){
                                case 0:
                                    Numero1=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero1 = Numero1 + Character.toString(partes);
                                    break;
                            }
                            break;
                        case 1:
                            switch(con){
                                case 0:
                                    Numero2=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero2 = Numero2 + Character.toString(partes);
                                    break;
                            }
                            break;
                    }
                    
                    break;
            }
        
        }
        
        int Longitud_Cadena1 = Numero1.length();
        int Longitud_Cadena2 = Numero2.length();
        int Numeros_en_decimal=0;
        
        for(int i=0;i<Longitud_Cadena1;i++){
            partes = Numero1.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        for(int i=0;i<Longitud_Cadena2;i++){
            partes = Numero2.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        
        switch(Numeros_en_decimal){
            case 0:
                int Numero_1_Entero = Integer.parseInt(Numero1);
                int Numero_2_Entero = Integer.parseInt(Numero2);
                int Suma_Entero = Numero_1_Entero - Numero_2_Entero;
                resultado_Final=String.valueOf(Suma_Entero);
                break;
            case 1:
                double Numero_1_Decimal= Double.parseDouble(Numero1);
                double Numero_2_Decimal= Double.parseDouble(Numero2);
                double Suma_Decimal = Numero_1_Decimal - Numero_2_Decimal;
                DecimalFormat formato = new DecimalFormat("#.00");
                resultado_Final = formato.format(Suma_Decimal);
                
                int Contador_Para_Final=0,Contador_De_Ceros=0;
        
                int Longitud_resultado_Final = resultado_Final.length();
        
                for(int i=0; i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
            
                    if(partes == '.'){
                        Contador_Para_Final++;
                    }
            
                    switch(Contador_Para_Final){
                         case 1:
                            if(partes ==  '0'){
                                Contador_De_Ceros++;
                            }
                         break;
                    }
                }
        
                if(Contador_De_Ceros == 2){
                    int contador_Final=0,contador_Suma=0;
                    String resultado_Final_Arreglado = "";
                    for(int i=0;i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
                    switch(partes){
                        case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
                
                
        }
        
        return resultado_Final;
    }
    
    public String Multiplicacion(String Cadena_analizar){
        int Longitud_de_Cadena_analizar = Cadena_analizar.length();
        char partes;
        int cont=0,con=0;
        String Numero1="",Numero2="",Cadena_suma="",resultado_Final="";
        
        for(int i=0;i<Longitud_de_Cadena_analizar;i++){
            partes = Cadena_analizar.charAt(i);
            
            switch(partes){
                case '*':
                    con=0;
                    cont++;
                    break;
                default:
                    switch(cont){
                        case 0:
                            switch(con){
                                case 0:
                                    Numero1=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero1 = Numero1 + Character.toString(partes);
                                    break;
                            }
                            break;
                        case 1:
                            switch(con){
                                case 0:
                                    Numero2=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero2 = Numero2 + Character.toString(partes);
                                    break;
                            }
                            break;
                    }
                    
                    break;
            }
        
        }
        
        int Longitud_Cadena1 = Numero1.length();
        int Longitud_Cadena2 = Numero2.length();
        int Numeros_en_decimal=0;
        
        for(int i=0;i<Longitud_Cadena1;i++){
            partes = Numero1.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        for(int i=0;i<Longitud_Cadena2;i++){
            partes = Numero2.charAt(i);
            if(partes == '.'){
                Numeros_en_decimal=1;
            }
        }
        
        
        switch(Numeros_en_decimal){
            case 0:
                int Numero_1_Entero = Integer.parseInt(Numero1);
                int Numero_2_Entero = Integer.parseInt(Numero2);
                int Suma_Entero = Numero_1_Entero * Numero_2_Entero;
                resultado_Final=String.valueOf(Suma_Entero);
                break;
            case 1:
                double Numero_1_Decimal= Double.parseDouble(Numero1);
                double Numero_2_Decimal= Double.parseDouble(Numero2);
                double Suma_Decimal = Numero_1_Decimal * Numero_2_Decimal;
                DecimalFormat formato = new DecimalFormat("#.00");
                resultado_Final = formato.format(Suma_Decimal);
                
                int Contador_Para_Final=0,Contador_De_Ceros=0;
        
                int Longitud_resultado_Final = resultado_Final.length();
        
                for(int i=0; i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
            
                    if(partes == '.'){
                        Contador_Para_Final++;
                    }
            
                    switch(Contador_Para_Final){
                         case 1:
                            if(partes ==  '0'){
                                Contador_De_Ceros++;
                            }
                         break;
                    }
                }
        
                if(Contador_De_Ceros == 2){
                    int contador_Final=0,contador_Suma=0;
                    String resultado_Final_Arreglado = "";
                    for(int i=0;i<Longitud_resultado_Final; i++){
                    partes = resultado_Final.charAt(i);
                    switch(partes){
                        case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
                
        }
        
        return resultado_Final;
    }
    
    public String Division(String Cadena_analizar){
        int Longitud_de_Cadena_analizar = Cadena_analizar.length();
        char partes;
        int cont=0,con=0;
        String Numero1="",Numero2="",Cadena_suma="",resultado_Final="";
        
        for(int i=0;i<Longitud_de_Cadena_analizar;i++){
            partes = Cadena_analizar.charAt(i);
            
            switch(partes){
                case '/':
                    con=0;
                    cont++;
                    break;
                default:
                    switch(cont){
                        case 0:
                            switch(con){
                                case 0:
                                    Numero1=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero1 = Numero1 + Character.toString(partes);
                                    break;
                            }
                            break;
                        case 1:
                            switch(con){
                                case 0:
                                    Numero2=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero2 = Numero2 + Character.toString(partes);
                                    break;
                            }
                            break;
                    }
                    
                    break;
            }
        
        }
        
        double Numero_1_Decimal= Double.parseDouble(Numero1);
        double Numero_2_Decimal= Double.parseDouble(Numero2);
        double Suma_Decimal = Numero_1_Decimal / Numero_2_Decimal;
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(Suma_Decimal);
        int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            String resultado_Final_Arreglado = "";
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
        
        return resultado_Final;
    }
    
    public String Elevada(String Cadena_analizar){
        int Longitud_de_Cadena_analizar = Cadena_analizar.length();
        char partes;
        int cont=0,con=0;
        String Numero1="",Numero2="",Cadena_suma="",resultado_Final="";
        
        for(int i=0;i<Longitud_de_Cadena_analizar;i++){
            partes = Cadena_analizar.charAt(i);
            
            switch(partes){
                case '^':
                    con=0;
                    cont++;
                    break;
                default:
                    switch(cont){
                        case 0:
                            switch(con){
                                case 0:
                                    Numero1=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero1 = Numero1 + Character.toString(partes);
                                    break;
                            }
                            break;
                        case 1:
                            switch(con){
                                case 0:
                                    Numero2=Character.toString(partes);
                                    con++;
                                    break;
                                case 1:
                                    Numero2 = Numero2 + Character.toString(partes);
                                    break;
                            }
                            break;
                    }
                    
                    break;
            }
        
        }
        
        double Numero_1_Decimal= Double.parseDouble(Numero1);
        double Numero_2_Decimal= Double.parseDouble(Numero2);
        double Suma_Decimal = Math.pow(Numero_1_Decimal, Numero_2_Decimal);
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(Suma_Decimal);
        int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            String resultado_Final_Arreglado = "";
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
        
        return resultado_Final;
    }
    
    public String Seno(String numero){
        
        char partes;
        String resultado_Final="",resultado_Final_Arreglado = "";
        double numeros=Math.toRadians(Double.parseDouble(numero));
        double F=Math.sin(numeros);
        
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(F);
         int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
        
        return resultado_Final;
    }
    
    public String Coseno(String numero){
        
        char partes;
        String resultado_Final="",resultado_Final_Arreglado = "";
        double numeros=Math.toRadians(Double.parseDouble(numero));
        double F=Math.cos(numeros);
        
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(F);
         int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;
        }
        
        return resultado_Final;
    }
    
    public String Tangente(String numero){
        
        char partes;
        String resultado_Final="",resultado_Final_Arreglado = "";
        double numeros=Math.toRadians(Double.parseDouble(numero));
        double F=Math.tan(numeros);
        
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(F);
         int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;

        }
        
        
        return resultado_Final;
    }
    
    public String Raiz(String numero){
        
        char partes;
        String resultado_Final="",resultado_Final_Arreglado = "";
        double numeros=Double.parseDouble(numero);
        double F=Math.sqrt(numeros);
        
        DecimalFormat formato = new DecimalFormat("#.00");
        resultado_Final = formato.format(F);
         int Contador_Para_Final=0,Contador_De_Ceros=0;
        
        int Longitud_resultado_Final = resultado_Final.length();
        
        for(int i=0; i<Longitud_resultado_Final; i++){
            partes = resultado_Final.charAt(i);
            
            if(partes == '.'){
                Contador_Para_Final++;
            }
            
            switch(Contador_Para_Final){
                case 1:
                    if(partes ==  '0'){
                        Contador_De_Ceros++;
                    }
                    break;
            }
        }
        
        if(Contador_De_Ceros == 2){
            int contador_Final=0,contador_Suma=0;
            for(int i=0;i<Longitud_resultado_Final; i++){
                partes = resultado_Final.charAt(i);
                switch(partes){
                    case '.':
                        contador_Final++;
                        break;
                    default:
                        if(contador_Final==0){
                            if(contador_Suma==0){
                            resultado_Final_Arreglado = Character.toString(partes);
                            contador_Suma++;
                            } else{
                            resultado_Final_Arreglado = resultado_Final_Arreglado + Character.toString(partes);
                            }
                        }
                        break;
                }
            }
            resultado_Final= resultado_Final_Arreglado;

        }
        
        
        return resultado_Final;
    }
    
}
