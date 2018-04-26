package pl.lodz.uni.springdemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lodz.uni.springdemo.domain.Student;
import pl.lodz.uni.springdemo.service.StudentService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudets() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Long studentId) {
        return studentService.findById(studentId).orElse(null);
    }

    @GetMapping("/students/search/{name}")
    public Student getStudent(@PathVariable("name") String name) {
        return studentService.findStudentByName(name);
    }

    @PostMapping("/students")
    public Student insert(@RequestBody @Valid Student student) {
        return studentService.save(student);
    }

}
