package ru.mylife.project.service;

import ru.mylife.project.model.User;
import java.util.List;

public interface UserService {
    List<User> get();
    User get(int id);
    void save(User user);
    void delete(int id);
}