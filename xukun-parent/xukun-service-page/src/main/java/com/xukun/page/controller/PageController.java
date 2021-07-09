package com.xukun.page.controller;

import com.xukun.common.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findById/{id}")
    public Department findById(@PathVariable Integer id){
        Department department = restTemplate.getForObject("http://localhost:9500/department/findById/" + id, Department.class);
        return department;
    }
}
