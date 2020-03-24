package com.zm.mybatisplus.mapper;

import com.zm.mybatisplus.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2018-12-29
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
