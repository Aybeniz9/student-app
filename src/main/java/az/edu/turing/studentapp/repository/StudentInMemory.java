package az.edu.turing.studentapp.repository;

import az.edu.turing.studentapp.entity.StudentEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public  class StudentInMemory implements StudentRepository{
public static List<StudentEntity> STUDENTEntities;

@PostConstruct
public void init() {
    STUDENTEntities = List.of(
            new StudentEntity(1L, "Bahruz", 22,67.67,false, LocalDateTime.of(2000,5,6,6,6)),
            new StudentEntity(2L, "Vusal", 21,69.56,false,LocalDateTime.of(2002,3,4,7,8)),
            new StudentEntity(3L, "Aybeniz", 18,98.67,true,LocalDateTime.of(2004,5,2,12,4))
    );
}

@Override
public StudentEntity save(StudentEntity studentEntity) {
    STUDENTEntities.add(studentEntity);
    // return STUDENTS.stream().filter(student1 -> student1.getId(),student.getStudentNumber(),student.getGrade(),student.getBirthDay(),student.getFullName(),student.getGender());
    return studentEntity;
}

@Override
public List<StudentEntity> findAll() {
    return STUDENTEntities;
}

@Override
public Optional<StudentEntity> findById(Long id) {
    return STUDENTEntities.stream().filter(studentEntity -> studentEntity.getId().equals(id)).findFirst();
}

@Override
public void deleteById(Long id) {

}

@Override
public boolean updateById(Long id) {
    return false;
}
}
