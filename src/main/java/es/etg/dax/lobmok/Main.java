package es.etg.dax.lobmok;

import es.etg.dax.lobmok.con.Alumno;

public class Main {
    public static void main(String[] args) {
        
        
        Alumno ac = new Alumno("nombre ", "Apellidos", 0);

        es.etg.dax.lobmok.sin.Alumno as = new es.etg.dax.lobmok.sin.Alumno("nombre ", "Apellidos", 0);


        System.out.println(ac);
        System.out.println(as);

        ac.setNombre("nombre nuev");
        as.setNombre("Nombre nuevo");
    }
}