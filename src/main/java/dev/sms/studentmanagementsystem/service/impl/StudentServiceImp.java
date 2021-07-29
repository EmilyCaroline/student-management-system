package dev.sms.studentmanagementsystem.service.impl;

import dev.sms.studentmanagementsystem.entity.Student;
import dev.sms.studentmanagementsystem.repository.StudentReposistory;
import dev.sms.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    private StudentReposistory studentReposistory;

    public StudentServiceImp(StudentReposistory studentReposistory) {
        super();
        this.studentReposistory = studentReposistory;
    }

    // To list all students from db
    @Override
    public List<Student> getAllStudents(){
        return studentReposistory.findAll();
    }

    // To create new students to db
    @Override
    public Student saveStudent(Student student) {
        return studentReposistory.save(student);
    }

    // To update student details to db
    @Override
    public Student updateStudent(Student student){
        return studentReposistory.save(student);
    }

    // To get student details from db by using student id
    @Override
    public Student getStudentById(Long id){
        return studentReposistory.findById(id).get();
    }

    // To delete student from db by using student id
    @Override
    public void deleteStudentByID(Long id){
        studentReposistory.deleteById(id);
    }
}
