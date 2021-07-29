package dev.sms.studentmanagementsystem.repository;

import dev.sms.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentReposistory extends JpaRepository<Student, Long> {


}
