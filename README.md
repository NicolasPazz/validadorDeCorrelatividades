# Validador de correlatividades

Modelo en Java que decide si un alumno puede inscribirse a una materia según sus correlativas: la inscripción se acepta solo si el alumno aprobó todas las materias correlativas de la materia elegida.

Ejercicio de diseño orientado a objetos (UTN FRBA – Diseño de Sistemas).

## Modelo

- **Materia**: nombre y conjunto de correlativas. Sabe responder si un alumno tiene todas sus correlativas aprobadas.
- **Alumno**: conjunto de materias aprobadas.
- **Inscripcion**: vincula alumno y materia, y delega en la materia la validación (`aprobada()`).

![Diagrama de clases](https://github.com/user-attachments/assets/f7b2d98c-8624-4739-82f7-4ec80788ddb6)

## Tests

Tests con JUnit 4 que cubren una inscripción aceptada y una rechazada:

```bash
mvn test
```
