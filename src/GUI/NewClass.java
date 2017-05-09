package GUI;
//PROLOG 1. Importando de jpl.jar
import org.jpl7.*;

public class NewClass {
    
    public static void main (String[] agrs){
        //PROLOG 2. Conexion con el archivo prolog.pl
        try{
            String conexion = "consult('programa.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion+"  "+(con.hasMoreSolutions()?"Aceptado":"Fallo"));
        }catch (Exception e){
            System.out.println("Error en cargando programa.pl\n"+e.getMessage()+"\n");
        }
    }
    
}
