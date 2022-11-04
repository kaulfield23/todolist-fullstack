package com.haeju.todobackend.repository;

import com.haeju.todobackend.model.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodolistRepository extends JpaRepository<Todolist, Long> {

}
