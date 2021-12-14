package com.example.springajaxblog.service.classRoom;

import com.example.springajaxblog.model.ClassRoom;
import com.example.springajaxblog.repository.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassService implements IClassService{
    @Autowired
    private IClassRepository classRepository;

    @Override
    public Iterable<ClassRoom> findAll() {
        return classRepository.findAll();
    }

    @Override
    public Optional<ClassRoom> findById(Long id) {
        return classRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        classRepository.deleteById(id);
    }

    @Override
    public ClassRoom save(ClassRoom classRoom) {
        return classRepository.save(classRoom);
    }
}
