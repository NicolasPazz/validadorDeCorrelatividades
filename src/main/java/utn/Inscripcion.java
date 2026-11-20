package utn;

import java.util.Objects;

public class Inscripcion {
    private Materia materia;
    private Alumno alumno;

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = Objects.requireNonNull(materia, "materia");
        this.alumno = Objects.requireNonNull(alumno, "alumno");
    }

    public boolean aprobada() {
        return materia.tieneCorrelativasAprobadas(alumno);
    }
}