package com.haeju.todobackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haeju.todobackend.model.Todolist;
import com.haeju.todobackend.repository.TodolistRepository;

@RestController
public class TodolistController {
    @Autowired
    private TodolistRepository todolistRepository;

    @PostMapping("/todolist")
    Todolist newTodo(@RequestBody Todolist newTodo) {
        return todolistRepository.save(newTodo);
    }

    @GetMapping("/todolists")
    List<Todolist> getAllTodolists() {
        return todolistRepository.findAll();
    }
}
