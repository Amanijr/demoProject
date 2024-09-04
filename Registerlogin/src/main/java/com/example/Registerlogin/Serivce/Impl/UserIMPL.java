package com.example.Registerlogin.Serivce.Impl;

import com.example.Registerlogin.Dto.LoginDTO;
import com.example.Registerlogin.Entity.User;
import com.example.Registerlogin.Dto.UserDTO;
import com.example.Registerlogin.Repository.UserRepo;
import com.example.Registerlogin.Serivce.UserService;
import com.example.Registerlogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserid(),
                userDTO.getFirstname(),
                userDTO.getLastname(),
                userDTO.getEmail(),
                userDTO.getPassword(), // No encoding
                userDTO.getTin(),
                userDTO.getNin()
        );

        userRepo.save(user);

        return user.getTin();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        User user1 = userRepo.findUserByTin(loginDTO.getTin());
        if (user1 != null) {
            String password = user1.getPassword();
            if (password.equals(loginDTO.getPassword())) { // Direct comparison
                Optional<User> user = userRepo.findUserByTinAndPassword(loginDTO.getTin(), loginDTO.getPassword());
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("Password Not Match", false);
            }
        } else {
            return new LoginResponse("TIN does not exist", false);
        }
    }
}

