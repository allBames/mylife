package ru.mylife.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mylife.project.model.User;
import ru.mylife.project.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> get() {
        return userService.get();
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable int id) {
        return userService.get(id);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable int id) {

       userService.delete(id);

        return "User removed with id "+id;

    }

    @PutMapping("/users")
    public User update(@RequestBody User user) {
        userService.save(user);
        return user;
    }
}
