package com.lz_sale.mapper;

import com.lz_sale.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//z商品分类
public interface CategoryMapper {


    // 插入一个Category对象
    int insert(Category category);


    // 根据id删除一个Category对象
    @Delete("delete from category where id = #{id}")
    int deleteById(Integer id);


    // 根据id更新一个Category对象
    int updateById(Category category);


    // 根据id查询一个Category对象
    @Select("select * from category where id = #{id}")
    Category selectById(Integer id);


    // 查询所有Category对象
    List<Category> selectAll(Category category);

}