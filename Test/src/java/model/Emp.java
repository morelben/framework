/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import etu001967.framework.utilitaire.ModelView;
import etu001967.framework.utilitaire.Url;



/**
 *
 * @author morel
 */
public class Emp {
    @Url(name="emp-findAll")
    public ModelView findAll(){  
        ModelView mv = new ModelView();
        mv.setView("List.jsp");
        return mv;
    }
    
    @Url(name="emp-addEmp")
    public void addDept(){
        
    }
    
}
