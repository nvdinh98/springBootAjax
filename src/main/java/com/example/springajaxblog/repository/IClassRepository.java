package com.example.springajaxblog.repository;

import com.example.springajaxblog.model.ClassRoom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClassRepository  extends PagingAndSortingRepository<ClassRoom,Long> {
}
