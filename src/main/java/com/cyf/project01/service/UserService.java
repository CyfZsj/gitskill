package com.cyf.project01.service;

import com.cyf.project01.domain.User;

import java.util.List;

public interface UserService {
     List<User> list();
     void save(User user);
     void delete(Integer id);
     void update(User user);
}
