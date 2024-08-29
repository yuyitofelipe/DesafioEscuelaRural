package cl.praxis.EscuelaRural.model.services;

import cl.praxis.EscuelaRural.model.entities.Course;
import cl.praxis.EscuelaRural.model.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Course findOne(int courseId) {
        return repository.findById(courseId).orElse(null);
    }
}