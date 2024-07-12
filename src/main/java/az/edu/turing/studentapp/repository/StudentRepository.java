package az.edu.turing.studentapp.repository;


import az.edu.turing.studentapp.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
 StudentEntity save(StudentEntity studentEntity);
 List<StudentEntity> findAll();
 Optional<StudentEntity> findById(Long id);
 void deleteById(Long id);
boolean updateById(Long id);
}
