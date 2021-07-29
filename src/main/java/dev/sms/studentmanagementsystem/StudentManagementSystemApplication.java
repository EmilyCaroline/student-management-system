package dev.sms.studentmanagementsystem;

import dev.sms.studentmanagementsystem.entity.Student;
import dev.sms.studentmanagementsystem.repository.StudentReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    // To initialized some students for testing
    @Autowired
    private StudentReposistory studentReposistory;
    @Override
    public void run(String... args) throws Exception{
//        Student student1 = new Student("Caroline Mary", "carolinemary224@gmail.com", "female");
//        studentReposistory.save(student1);
//
//        Student student2 = new Student("Emily Roses", "emilyroses@gmail.com", "female");
//        studentReposistory.save(student2);
//
//        Student student3 = new Student("James Arthur", "jamesarthur@gmail.com", "male");
//        studentReposistory.save(student3);
    }
}
