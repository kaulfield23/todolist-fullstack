package com.haeju.todobackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Todolist {
    @Id
    @GeneratedValue

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String task;

    @Getter
    @Setter
    private boolean isDone;
}
