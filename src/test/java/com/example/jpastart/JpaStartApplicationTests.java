package com.example.jpastart;

import com.example.jpastart.model.Student;
import com.example.jpastart.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class JpaStartApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testStudent(){
        Student st1 = new Student();
        st1.setBorn(LocalDate.now());
        st1.setName("Anne");
        studentRepository.save(st1);

        List<Student> list = studentRepository.findAll();
        assertEquals(1, list.size());

        studentRepository.delete(st1);
        list = studentRepository.findAll();
        assertEquals(0,list.size());

        Optional<Student> opt3 = studentRepository.findById(1);
        if (opt3.isPresent()){
            Student std3 = opt3.get();
            assertEquals(std3.getName(), "Anne");
        }

    }
}
