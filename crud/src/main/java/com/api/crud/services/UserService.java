package com.api.crud.services;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUser(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }

    public UserModel updateByID(UserModel request, Long id){
        UserModel user = userRepository.findById(id).orElse(null);

        if (user != null){
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setEmail(request.getEmail());

            UserModel updatedUser = userRepository.save(user);
            return updatedUser;
        }
        return null;
    }

    public Boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
    }
}
}
