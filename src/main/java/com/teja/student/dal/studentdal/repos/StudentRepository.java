package com.teja.student.dal.studentdal.repos;

import com.teja.student.dal.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
