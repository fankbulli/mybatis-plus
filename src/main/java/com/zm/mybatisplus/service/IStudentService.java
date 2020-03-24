package com.zm.mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import com.zm.mybatisplus.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2018-12-29
 */
public interface IStudentService extends IService<Student> {
    IPage<Student> findPage(Page<Student> page, QueryWrapper<Student> queryWrapper);

}
