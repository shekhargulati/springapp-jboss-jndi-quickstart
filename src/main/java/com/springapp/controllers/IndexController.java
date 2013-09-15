package com.springapp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.domain.Todo;

@Controller
public class IndexController {

    @Autowired
    private TodoDao todoDao;
    
    
    @RequestMapping("/")
    public void index(HttpServletRequest request, HttpServletResponse response) throws Exception{
        todoDao.create(new Todo("Learn OpenShift"));
        List<Todo> todos = todoDao.allTodos();
        response.getWriter().print(todos.toString());
    }
}
