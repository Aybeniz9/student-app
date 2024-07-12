package az.edu.turing.studentapp.service.impl;

import az.edu.turing.studentapp.entity.StudentEntity;
import az.edu.turing.studentapp.repository.StudentRepository;
import az.edu.turing.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public boolean deleteFailedStudents(Double grade) {
        List<StudentEntity> failedStudentEntities = studentRepository.findAll().stream().filter(student -> student.getGrade() < 51).toList();
        try {
        failedStudentEntities.forEach(student -> studentRepository.deleteById(student.getId()));
        return true;
        }catch (Exception e){
            return false;
        }
    }
}
