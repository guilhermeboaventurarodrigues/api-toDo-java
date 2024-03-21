package com.apitodo.apitodospring.repository;

import com.apitodo.apitodospring.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
