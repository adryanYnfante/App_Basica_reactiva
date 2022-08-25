package com.example.demo.repositories;

import com.example.demo.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends ReactiveMongoRepository<Dato, String> {
}
