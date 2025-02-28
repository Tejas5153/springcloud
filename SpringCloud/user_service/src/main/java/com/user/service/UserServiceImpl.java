package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    List<User> list=List.of(
            new User(2122L,"Ganesh Patil","2345325639"),
            new User(2123L,"Akash Patil","2345325639"),
            new User(2124L,"Mahesh Patil","2345325639"),
            new User(2125L,"Paresh Patil","2345325639"));

    @Override
    public User getUserInfoById(Long Id) {
        return this.list.stream().filter(user -> user.getUserId().equals(Id)).findAny().orElse(null);
    }
}
