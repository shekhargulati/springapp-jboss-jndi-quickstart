package com.springapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springapp.controllers.IndexController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = IndexController.class)
public class WebConfig {

}
