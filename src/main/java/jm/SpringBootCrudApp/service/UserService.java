package jm.SpringBootCrudApp.service;


import jm.SpringBootCrudApp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    List<User> allUsers();
    void add(User user);
    void delete(Integer id);
    void edit(User user);
    User getById(Integer id);
    User getUserByName(String name);
}


