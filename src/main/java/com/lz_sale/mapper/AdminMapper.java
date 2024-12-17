package com.lz_sale.mapper;

import com.lz_sale.entity.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface AdminMapper {


    // 插入管理员信息
    int insert(Admin admin);


    // 根据id删除管理员信息
    @Delete("delete from admin where id = #{id}")
    int deleteById(Integer id);


    // 根据id更新管理员信息
    int updateById(Admin admin);


    // 根据id查询管理员信息
    @Select("select * from admin where id = #{id}")
    Admin selectById(Integer id);


    // 查询所有管理员信息
    List<Admin> selectAll(Admin admin);

    // 根据用户名查询管理员信息
    @Select("select * from admin where username = #{username}")
    Admin selectByUsername(String username);

}