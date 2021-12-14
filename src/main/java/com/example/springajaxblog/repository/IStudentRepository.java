package com.example.springajaxblog.repository;

import com.example.springajaxblog.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IStudentRepository extends PagingAndSortingRepository<Student,Long> {
}
