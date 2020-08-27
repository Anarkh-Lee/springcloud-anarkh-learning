package com.anarkh.cloud.userservice.service;

import com.anarkh.cloud.userservice.domain.User;

import java.util.List;

/**
 * @author Anarkh
 * @date 2020/8/27 16:12
 * @description
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
