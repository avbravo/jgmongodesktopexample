/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jgmongodesktopexample.entity;

import com.avbravo.jgmongodesktopexample.ejb.SedesFacade;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jgmongo.anotaciones.Embedded;
import com.jgmongo.anotaciones.Id;
import com.jgmongo.anotaciones.Relationships;
import com.jgmongo.services.GenericBeans;
import com.mongodb.DBRef;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Provincias extends GenericBeans {

    @Id
    private String idprovincia;
    private String provincia;

    private  Paises paises;
//     @Expose(serialize = false, deserialize = false)

    //@Embedded


//   @SerializedName("Paises")
//    @DBRef()
//       @Relationships(document = "Sedes", field = "idsede", ispadre = false)

//    @Relationships(document = "Sedes", field = "idsede", ispadre = false)
//    @SerializedName("idsede")
//    private Integer idsede;

    /**
     *
     * @param idsede
     * @return
     */
   

    public Document toDocument(Provincias provincias) {
//     DBRef dbr = new DBRef("paises", paises);
     
//        return Document.parse(getGson().toJson(provincias));
return toDoc(provincias);
    }

    public Provincias toPojo(Document doc) {
//         return (Provincias) fromJsontoPojo(doc.toJson(), new Provincias().getClass());
  return (Provincias) toJava(doc, new Provincias().getClass());
    //     return (Provincias) fromJsontoPojo(doc, new Provincias().getClass());
    }

//    @Override
//    public String toString() {
//        return "Provincias{" + "idprovincia=" + idprovincia + ", provincia=" + provincia + ", paises=" + paises + ", sedes=" + sedes + '}';
//    }

    @Override
    public String toString() {
        return "Provincias{" + "idprovincia=" + idprovincia + ", provincia=" + provincia + ", paises=" + paises + '}';
    }

    

}
