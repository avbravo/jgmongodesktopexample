/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample.entity;


import com.google.gson.annotations.SerializedName;
import com.jgmongo.anotaciones.Id;
import com.jgmongo.services.GenericBeans;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Paises extends GenericBeans {
    @Id
    @SerializedName("Siglas")
    private String siglas;
    @SerializedName("Pais")
    private String pais;
    @SerializedName("Logo")
    private String logo;
    

    public Document toDocument(Paises paises) {
        return toDoc(paises);
//        Document doc = new Document();
//        try {                        
//            doc = Document.parse(getGson().toJson(paises));
//        } catch (Exception e) {
//            System.out.println("toDocument() " + e.getLocalizedMessage());
//        }
//        return doc;
    }

    public Paises toPojo(Document doc) {
//        Paises paises = new Paises();
//        try {
//             paises = (Paises) fromJsontoPojo(doc.toJson(), new Paises().getClass());
//        } catch (Exception e) {
//            System.out.println("toPojo() " + e.getLocalizedMessage());
//        }
//        return paises;
return (Paises) toJava(doc, new Paises().getClass());
    }

    @Override
    public String toString() {
        return "Paises{" + "siglas=" + siglas + ", pais=" + pais + '}';
    } 
}
