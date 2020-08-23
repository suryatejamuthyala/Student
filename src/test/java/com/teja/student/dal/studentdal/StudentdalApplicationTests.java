package com.teja.student.dal.studentdal;

import com.teja.student.dal.studentdal.entities.Student;
import com.teja.student.dal.studentdal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent() {
        Student student = new Student();
        student.setName("Teja");
        student.setCourse("java");
        student.setFee(500.00);
        studentRepository.save(student);
    }

}
