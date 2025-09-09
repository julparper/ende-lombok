package es.etg.dax.lobmok.con;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private int edad;
}
