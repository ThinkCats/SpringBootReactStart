package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * Created by Wanglei on 15/11/26.
 */
public interface UserMapper {
    List<User> findUserList();
}
