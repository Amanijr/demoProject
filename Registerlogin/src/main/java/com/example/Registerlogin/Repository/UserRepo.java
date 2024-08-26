package com.example.Registerlogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Registerlogin.Entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    

}
