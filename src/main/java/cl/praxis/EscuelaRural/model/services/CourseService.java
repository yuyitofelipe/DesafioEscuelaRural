package cl.praxis.EscuelaRural.model.services;

import cl.praxis.EscuelaRural.model.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findOne(int courseId);
}