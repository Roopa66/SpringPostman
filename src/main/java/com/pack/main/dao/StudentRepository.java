package com.pack.main.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pack.main.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{


}
