package cl.praxis.EscuelaRural.model.repository;
import cl.praxis.EscuelaRural.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}