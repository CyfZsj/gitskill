package com.cyf.project01.mapper;

import com.cyf.project01.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select id,user_name,sex from user")
    List<User> list();
    @Insert("insert into user(user_name,password,sex)values(#{userName},#{password},#{sex})")
    void save(User user);
    @Delete("delete from user where id=#{id}")
    void delete(Integer id);

    void update(User user);
}
