package pl.lodz.uni.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lodz.uni.springdemo.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentByName(String name);

}
