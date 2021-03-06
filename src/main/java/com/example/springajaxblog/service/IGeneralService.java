package com.example.springajaxblog.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void remove(Long id);

    T save(T t);
}
