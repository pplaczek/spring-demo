package pl.lodz.uni.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lodz.uni.springdemo.domain.Student;
import pl.lodz.uni.springdemo.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student findStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

}
