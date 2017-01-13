/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample;

import com.avbravo.jgmongodesktopexample.ejb.PaisesFacade;
import com.avbravo.jgmongodesktopexample.ejb.ProvinciasFacade;
import com.avbravo.jgmongodesktopexample.ejb.SedesFacade;
import com.avbravo.jgmongodesktopexample.entity.Paises;
import com.avbravo.jgmongodesktopexample.entity.Provincias;
import com.avbravo.jgmongodesktopexample.entity.Sedes;
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
            ProvinciasFacade provinciasFacade = new ProvinciasFacade();
            
            List<Provincias> list = provinciasFacade.findAll();
            list.forEach((p) -> {
                System.out.println(" "+p.toString());
            });
            
//                    
//            Provincias provincias = new Provincias();
//            provincias.setIdprovincia("6");
//            Provincias pr = provinciasFacade.findById(provincias);
//            if(pr.getIdprovincia() == null){
//                System.out.println("---> no hay provincia con ese id");
//            }else{
//                System.out.println("---> "+pr.toString());
//            }
            
//            Paises paises = new Paises();
//            paises.setSiglas("5");
//            Paises p = paisesFacade.findById(paises);
//
//         if(p.getSiglas() == null){
//                System.out.println("============================");
//                System.out.println("no hay paises con siglas "+paises.getSiglas());
//            }else{
//                System.out.println("paises: "+p.toString());
//            }
//            Provincias provincias = new Provincias();
//            provincias.setIdprovincia("9");
//            provincias.setProvincia("Veraguas");
//            provincias.setPaises(p);
//            
//            if(provinciasFacade.save(provincias)){
//                System.out.println("guardado");
//            }else{
//                System.out.println("no se guardo");
//            }
//          
//            List<Paises> list = paisesFacade.findAll();
//          Sedes sedes = new Sedes();
//               sedes.setIdsede("s-2");
//                sedes.setSede("Sede 2");
//                sedes.setPaises(list);
//                sedesFacade.save(sedes);
//          

          
        } catch (Exception e) {
            System.out.println("error " + e.getLocalizedMessage());
        }

    }

}
