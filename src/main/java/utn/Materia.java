package utn;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia); 
    }
    public boolean tieneCorrelativasAprobadas(Alumno alumno) {
        for (Materia correlativa : correlativas) {
            if (!alumno.aproboMateria(correlativa)) {
                return false;
            }
        }
        return true;
    }
}
