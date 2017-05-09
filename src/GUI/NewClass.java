/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import org.jpl7.*;
/**
 *
 * @author Juan Benítez
 */
public class NewClass {
    
    public static void main (String[] agrs){
        
        try{
            String conexion = "consult('programa.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion+"  "+(con.hasMoreSolutions()?"Aceptado":"Fallo"));
        }catch (Exception e){
            
        }
    }
    
}
