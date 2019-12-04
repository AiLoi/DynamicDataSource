package com.datasource.mapper;


import com.datasource.module.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from User where id = #{userId}")
    User selectUserInfo(Integer userId);

}
