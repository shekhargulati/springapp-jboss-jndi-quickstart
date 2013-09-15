package com.springapp.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.domain.Todo;

@Repository
@Transactional
public class TodoDao {

    @PersistenceContext
    EntityManager entityManager;

    public void create(Todo todo) {
        entityManager.persist(todo);
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<Todo> allTodos() {
        return entityManager.createQuery("select t from Todo t").getResultList();
    }
}
