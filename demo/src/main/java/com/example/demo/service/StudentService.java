package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> list() {
        return studentRepository.findAll();
    }

    public ResponseEntity<Student> findByStudentId(long id) {
        Optional<Student> student =  studentRepository.findById(id);
        if(student.isPresent()){
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    public Iterable<Student> save(List<Student> students){
        return studentRepository.saveAll(students);
    }

}
