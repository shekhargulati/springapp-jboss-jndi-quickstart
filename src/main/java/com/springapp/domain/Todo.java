package com.springapp.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Todo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String todo;
 
    private Date createdOn = new Date();
 
    public Todo(String todo) {
        this.todo = todo;
    }
 
    public Todo() {
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTodo() {
        return todo;
    }
 
    public void setTodo(String todo) {
        this.todo = todo;
    }
 
    public Date getCreatedOn() {
        return createdOn;
    }
 
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", todo=" + todo + ", createdOn=" + createdOn + "]";
    }
 
 
 
}