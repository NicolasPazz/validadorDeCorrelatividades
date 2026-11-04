# Course Prerequisite Validator

Small Java model that decides whether a student can enroll in a university course: the enrollment is accepted only if the student has passed every prerequisite ("correlativa") of that course.

Object-oriented design exercise for the Systems Design course at UTN FRBA.

## Model

- `Materia` (course): name and set of prerequisite courses. Knows whether a student has passed all of them.
- `Alumno` (student): set of passed courses.
- `Inscripcion` (enrollment): links a student and a course, and delegates the check to the course (`aprobada()`).

![Class diagram](https://github.com/user-attachments/assets/f7b2d98c-8624-4739-82f7-4ec80788ddb6)

## Tests

JUnit 4 tests cover an accepted and a rejected enrollment:

```bash
mvn test
```
