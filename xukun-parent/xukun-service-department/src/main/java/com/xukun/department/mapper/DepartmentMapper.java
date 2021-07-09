package com.xukun.department.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xukun.common.pojo.Department;

public interface DepartmentMapper extends BaseMapper<Department> {
  
  void udpate();
}
