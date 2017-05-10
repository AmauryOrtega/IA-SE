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
    
    public static void main(String[] args) {
        
        
        String t1 = "consult('programa.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + "  " + (q1.hasMoreSolutions() ? "Correcto" : "Falso"));
        Query q2 = new Query("puedoApagar(Z)");
        /**System.out.println(" "+(q2.hasMoreSolutions() ? "si": "no"));**/
        String res ;
        try{
        res = "" + q2.oneSolution().get("Z");
        System.out.println("res " + res);
        }catch(Exception e){
            System.out.println("No se puede apaagr");
        }
        
    }
    
    
}
