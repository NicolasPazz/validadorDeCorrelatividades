package utn;

public class Inscripcion {
    private Materia materia;
    private Alumno alumno;

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }

    public boolean aprobada() {
        return materia.tieneCorrelativasAprobadas(alumno);
    }
}