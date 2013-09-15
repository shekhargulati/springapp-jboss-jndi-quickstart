package com.springapp.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springapp.domain.Todo;

@Repository
public class TodoDao {

    @PersistenceContext
    EntityManager entityManager;
    
    public void create(Todo todo){
        entityManager.persist(todo);
    }
    
    
    @SuppressWarnings("unchecked")
    public List<Todo> allTodos(){
        return entityManager.createQuery("select t from Todo").getResultList();
    }   
}
