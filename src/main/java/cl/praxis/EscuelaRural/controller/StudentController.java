package cl.praxis.EscuelaRural.controller;

import cl.praxis.EscuelaRural.model.entities.Student;
import cl.praxis.EscuelaRural.model.services.CourseService;
import cl.praxis.EscuelaRural.model.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String listStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/new")
    public String showNewStudentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.findAll());
        return "newStudent";
    }

    @PostMapping("/new")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/{studentId}")
    public String showEditStudentForm(@PathVariable("studentId") int studentId, Model model) {
        Student student = studentService.findOne(studentId);
        if (student != null) {
            model.addAttribute("student", student);
            model.addAttribute("courses", courseService.findAll());
            return "editStudent";
        } else {
            return "redirect:/students";
        }
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable("studentId") int studentId) {
        studentService.delete(studentId);
        return "redirect:/students";
    }
}