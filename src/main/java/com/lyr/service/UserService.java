package com.lyr.service;

import com.lyr.pojo.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User getUserByName(String username);
}
