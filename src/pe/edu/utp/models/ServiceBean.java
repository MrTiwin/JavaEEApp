package pe.edu.utp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class ServiceBean implements Serializable {
    JavaEEService service;
    InitialContext context=null;
    String textCriterio="";
    public ServiceBean(){
        try{
            context = new InitialContext();
            service = new JavaEEService(context);
        }catch (NamingException e){
            e.printStackTrace();
        }
    }
}
