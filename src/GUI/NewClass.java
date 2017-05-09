package GUI;
//PROLOG 1. Importando de jpl.jar

import org.jpl7.Query;

public class NewClass {

    public static void main(String[] agrs) {
        //PROLOG 2. Conexion con el archivo prolog.pl

        String consulta = "consult('programa.pl')";
        Query qConsulta = new Query(consulta);
//        System.out.println(qConsulta.hasSolution());

    }

}
