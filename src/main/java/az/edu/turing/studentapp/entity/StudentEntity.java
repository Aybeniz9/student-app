package az.edu.turing.studentapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


//@Entity
@Data
//@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private Integer studentNumber;
    private Double grade;
    private Boolean gender;
    private LocalDateTime birthDay;

}
