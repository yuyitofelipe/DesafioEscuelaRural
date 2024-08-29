package cl.praxis.EscuelaRural.model.services;

import cl.praxis.EscuelaRural.model.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findOne(int studentId);
    void save(Student student);
    void delete(int studentId);
}