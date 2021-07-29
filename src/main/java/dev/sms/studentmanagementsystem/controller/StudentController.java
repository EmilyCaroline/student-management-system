package dev.sms.studentmanagementsystem.controller;

import dev.sms.studentmanagementsystem.entity.Student;
import dev.sms.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/student/new")
    public String createStudentForm(Model model){
        // Create student from the from data that user inputs
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/student/update/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudentForm(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        // Retreive student from db with student id
        Student oldStudent = studentService.getStudentById(id);
        oldStudent.setId(student.getId());
        oldStudent.setFullName(student.getFullName());
        oldStudent.setEmail(student.getEmail());
        oldStudent.setGender(student.getGender());

        // Save the updated student info to db
        studentService.updateStudent(oldStudent);
        return "redirect:/students";
    }

    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentByID(id);
        return "redirect:/students";
    }

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

}
