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
public class Constructor {
    private String Formula;
    
    public Constructor(String Formula_Modificada){
        this.Formula = Formula_Modificada;
    }

    Constructor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void set_Formula(String Formulas){
        Formula = Formulas;
    }
    
    public String get_Formula(){
        return Formula;
    }
    
    public String to_string(){
        return Formula;
    }
    
}
