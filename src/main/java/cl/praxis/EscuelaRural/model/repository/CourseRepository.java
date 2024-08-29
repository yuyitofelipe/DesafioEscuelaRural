package cl.praxis.EscuelaRural.model.repository;
import cl.praxis.EscuelaRural.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}