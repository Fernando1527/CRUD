package com.api.crud.controllers;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;
import com.api.crud.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUser() {
        return this.userService.getUser();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel userModel) {
        return this.userService.saveUser(userModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserByID(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserByID(@RequestBody UserModel request, @PathVariable("id") Long id) {
        return this.userService.updateByID(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserByID(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUser(id);
        if (ok) {
            return "User with ID " + id + " Deleted! ";
        } else {
            return "Error, we had a problem deleting this user with ID " + id;
        }
    }
}

