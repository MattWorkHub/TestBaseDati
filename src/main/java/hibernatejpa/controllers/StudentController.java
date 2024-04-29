package hibernatejpa.controllers;



import hibernatejpa.entities.Student;
import hibernatejpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> addStudente(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> selectAllStudent(){
        List<Student> students =   studentService.viewAllStudents();
        return ResponseEntity.ok().body(students);
    }

}