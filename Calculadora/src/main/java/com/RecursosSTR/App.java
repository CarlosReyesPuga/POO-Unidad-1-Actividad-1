package com.RecursosSTR;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App 
{
     
    
    
    public static void main(String[] args) {
       arreglos Primera_parte = new arreglos();
       Scanner leer = new Scanner(System.in);
       int error=0,encontrar_x,prioridad_1=0,prioridad_2=0,prioridad_3=0,prioridad_4=0;
       String formula_volatil="", formula;
       Constructor cs = new Constructor();
       
      do{
      
       System.out.println("Teclea tu formula:");
       formula= leer.nextLine();
       
       int Longitud_Formula = formula.length();
       for(int i=0; i<7;i++){
           switch(i){
               case '0':
                   encontrar_x=Primera_parte.Buscar_x(formula);
                   if(encontrar_x!=0){
                       System.out.println("Teclea el valor de x:");
                       String valor_x= leer.nextLine();
                       formula_volatil=Primera_parte.Modificar_x(formula, valor_x);
                   }
                   formula=formula_volatil;
                   break;
               case '1':
                   error=Primera_parte.Error_Utilizando_Letras_No_Permitidas(formula);
                   break;
               case '2':
                   error=Primera_parte.Errores_De_Funciones_Con_Simbolos_En_Posicion_Incorrecta(formula);
                   break;
               case '3':
                   error=Primera_parte.Errores_De_Funciones_Sin_Simbolos_Error_Al_Resolver(formula);
                   break;
               case '4':
                   error=Primera_parte.Errores_De_Funciones_Sin_Simbolos_Error_Escritura(formula);
                   break;
               case '5':
                   error=Primera_parte.Problemas_De_Parentesis(formula);
                   break;
               case '6':
                   error=Primera_parte.Problemas_numero_decimal(formula);
                   break;
                
           }
       }
          
      }while(error==1); 
      
      Prioridad prioridad = new Prioridad();
      
      for(int i=0;i<4;i++){
          switch(i){
              case '0':
                  prioridad_1=prioridad.Prioridad1(formula);
                  break;
              case '1':
                  prioridad_2=prioridad.Prioridad2(formula);
                  break;
              case '2':
                  prioridad_3=prioridad.Prioridad3(formula);
                  break;
              case '3': 
                  prioridad_4=prioridad.Prioridad4(formula);
                  break;
              
          }
      
      }
          
      Operaciones oper = new Operaciones();
      
      while(prioridad_1!=0){
          formula_volatil=oper.Resolver_Primera_Parte(formula);
      }
      
      while(prioridad_2!=0){
          formula_volatil=oper.Resolver_Primera_Parte(formula);
      }
      
      while(prioridad_3!=0){
          formula_volatil=oper.Resolver_Primera_Parte(formula);
      }
      
      while(prioridad_4!=0){
          formula_volatil=oper.Resolver_Primera_Parte(formula);
      }
      
       
     }
    
}
