package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.sky.entity.User;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据openid查询微信用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid=#{openid}")
    User getByOpenid(String openid);

    /**
     * 插入新用户
     * @param user
     */
    void insert(User user);
}
