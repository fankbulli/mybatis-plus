package com.zm.mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zm.mybatisplus.entity.Student;
import com.zm.mybatisplus.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2018-12-29
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @RequestMapping("/all")
    public List<Student> findall(){
        return studentService.list(null);
    }
    @RequestMapping("/page/{page}/{size}")
    public IPage<Student> findPage(@PathVariable Integer page,@PathVariable Integer size,Student student){
        student=student==null?new Student():student;
        System.out.println("wiidsadasd");
        page=page==null?0:page;
        size=size==null?10:size;
        Page<Student> page1=new Page<>(page,size);
        QueryWrapper<Student> queryWrapper=new QueryWrapper<Student>(student);
        return studentService.findPage(page1,queryWrapper);
    }

}
