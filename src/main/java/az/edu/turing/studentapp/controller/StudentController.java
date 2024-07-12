package az.edu.turing.studentapp.controller;
import az.edu.turing.studentapp.entity.StudentEntity;
import az.edu.turing.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/students/")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Optional<StudentEntity> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    @PostMapping("/new")
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity){
        return studentService.createStudent(studentEntity);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@RequestBody Long id){
        studentService.deleteStudent(id);
    }
    @PutMapping("/update/{id}")
    public boolean updateStudent(@RequestBody Double grade){
        return  studentService.deleteFailedStudents(grade);
    }


}