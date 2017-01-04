/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample;

import com.avbravo.jgmongodesktopexample.ejb.PaisesFacade;
import com.avbravo.jgmongodesktopexample.ejb.SedesFacade;
import com.avbravo.jgmongodesktopexample.entity.Paises;
import com.avbravo.jgmongodesktopexample.entity.Sedes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            PaisesFacade paisesFacade = new PaisesFacade();
            SedesFacade sedesFacade = new SedesFacade();
            List<Paises> list = new ArrayList<>();
            list = paisesFacade.findAll();
            if (!list.isEmpty()) {
                Sedes sedes = new Sedes();
                sedes.setIdsede("s-1");
                sedes.setSede("Sede 1");
                sedes.setPaises(list);
                sedesFacade.save(sedes);
            }

          
        } catch (Exception e) {
            System.out.println("error " + e.getLocalizedMessage());
        }

    }

}
