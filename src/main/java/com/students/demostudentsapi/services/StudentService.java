package com.students.demostudentsapi.services;

import com.students.demostudentsapi.models.Student;
import com.students.demostudentsapi.studentsRepo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentsRepo studentsRepo;

    //POST
    public void addStudent(Student student){
        studentsRepo.save(student);
    }


    //GET
    public List<Student> getAllStudents(){
        List<Student> listOfStudents = new ArrayList<>();
        studentsRepo.findAll().forEach(listOfStudents::add);
        return listOfStudents;
    }

    // GET BY ID

    public Optional<Student> getStudentById(Long id){
        return studentsRepo.findById(id);
    }

    //PUT
    public void updateStudent(Long id, Student student){
        studentsRepo.save(student);
    }

    // DELETE BY ID
    public void deleteStudent(Long id){
        studentsRepo.deleteById(id);
    }

}
