package ru.mylife.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mylife.project.DAO.UserDAO;
import ru.mylife.project.model.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDao;
    @Transactional
    @Override
    public List<User> get() {
        return userDao.get();
    }
    @Transactional
    @Override
    public User get(int id) {
        return userDao.get(id);
    }
    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);

    }
    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);

    }
}