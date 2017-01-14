/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample;

import com.avbravo.jgmongodesktopexample.ejb.PaisesFacade;
import com.avbravo.jgmongodesktopexample.ejb.ProvinciasFacade;
import com.avbravo.jgmongodesktopexample.ejb.SedesFacade;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

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
         MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("fantasy");
		MongoCollection<Document> collection = database
				.getCollection("paises");
 
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
 
           	for(Document document : documents){
               	System.out.println(document);
                    System.out.println("Siglas"+ document.get("Siglas"));
                    System.out.println("Pais"+ document.get("Pais"));
           	}
	

            
            
//            
//            List<Provincias> list = provinciasFacade.findAll();
//            list.forEach((p) -> {
//                System.out.println(" "+p.toString());
//            });
            
//                    
//            Provincias provincias = new Provincias();
//            provincias.setIdprovincia("6");
//            Provincias pr = provinciasFacade.findById(provincias);
//            
//            if(pr.getIdprovincia() == null){
//                System.out.println("---> no hay provincia con ese id");
//            }else{
//                System.out.println("---> "+pr.toString());
//            }
            
//            Paises paises = new Paises();
//            paises.setSiglas("pa");
//            Paises p = paisesFacade.findById(paises);
//
//         if(p.getSiglas() == null){
//                System.out.println("============================");
//                System.out.println("no hay paises con siglas "+paises.getSiglas());
//            }else{
//                System.out.println("paises: "+p.toString());
//            }
//            Provincias provincias = new Provincias();
//            provincias.setIdprovincia("2");
//            provincias.setProvincia("Cocle");
//            provincias.setPaises(p);
//          //  provincias.setHola("Hola");
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
