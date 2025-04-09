import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import utn.Alumno;
import utn.Inscripcion;
import utn.Materia;

public class InscripcionTest {

    private Alumno alumno;
    private Materia algoritmos;
    private Materia paradigmas;
    private Materia diseñoSistemas;

    @Before
    public void setUp() {
        alumno = new Alumno("Juan Perez");
        algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        paradigmas = new Materia("Paradigmas de Programación");
        diseñoSistemas = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseñoSistemas.agregarCorrelativa(paradigmas);
    }

    @Test
    public void testInscripcionAceptada() {
        alumno.agregarMateriaAprobada(algoritmos);
        alumno.agregarMateriaAprobada(paradigmas);

        Inscripcion inscripcion = new Inscripcion(diseñoSistemas, alumno);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionRechazada() {
        alumno.agregarMateriaAprobada(algoritmos);

        Inscripcion inscripcion = new Inscripcion(diseñoSistemas, alumno);
        assertFalse(inscripcion.aprobada());
    }
}
