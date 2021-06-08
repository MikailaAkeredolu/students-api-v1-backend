package com.students.demostudentsapi.studentsRepo;

import com.students.demostudentsapi.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends CrudRepository<Student, Long> {

    Student findByEmail(String email);
}
