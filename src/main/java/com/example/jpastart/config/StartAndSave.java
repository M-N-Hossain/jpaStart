package com.example.jpastart.config;

import com.example.jpastart.model.Student;
import com.example.jpastart.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StartAndSave implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        Student st1 = new Student();
        st1.setBorn(LocalDate.now());
        st1.setName("Anne");
        studentRepository.save(st1);

        Student st2 = new Student();
        st2.setBorn(LocalDate.now().plusDays(1000));
        st2.setName("Viggo");
        studentRepository.save(st2);

    }
}
