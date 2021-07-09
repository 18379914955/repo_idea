package com.xukun.department.service.impl;

import com.xukun.common.pojo.Department;
import com.xukun.department.mapper.DepartmentMapper;
import com.xukun.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public Department findById(Integer id) {
        return departmentMapper.selectById(id);
    }
}
