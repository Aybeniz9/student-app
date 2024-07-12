package az.edu.turing.studentapp.service;
import az.edu.turing.studentapp.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {
 List<StudentEntity> getAllStudents();
 Optional<StudentEntity> getStudentById(Long id);
 StudentEntity createStudent(StudentEntity studentEntity);
 void deleteStudent(Long id);
 boolean deleteFailedStudents(Double grade);


}

