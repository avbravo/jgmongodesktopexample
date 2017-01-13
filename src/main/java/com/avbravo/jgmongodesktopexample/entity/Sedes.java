/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample.entity;


import com.google.gson.annotations.SerializedName;
import com.jgmongo.anotaciones.Id;
import com.jgmongo.services.GenericBeans;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Sedes extends GenericBeans {
    @Id
    @SerializedName("Idsede")
    private String idsede;
    @SerializedName("Sede")
    private String sede;
    @SerializedName("Paises")
    private List<Paises> paises;

    public Document toDocument(Sedes sedes) {
//          return Document.parse(getGson().toJson(sedes));
          return toDoc(sedes);
    }

    public Sedes toPojo(Document doc) {
        
//        return (Sedes) fromJsontoPojo(doc.toJson(), new Sedes().getClass());
return (Sedes)toJava(doc, new Sedes().getClass());
    }

    @Override
    public String toString() {
        return "Sedes{" + "idsede=" + idsede + ", sede=" + sede + '}';
    }

  
}
