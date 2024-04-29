package hibernatejpa.services;

import hibernatejpa.entities.Student;
import hibernatejpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public List<Student> viewAllStudents(){
        return studentRepository.findAll();
    }
}