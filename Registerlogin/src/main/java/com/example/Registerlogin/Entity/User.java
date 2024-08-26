package com.example.Registerlogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name = "first_name", length = 255)
    private String firstname;

    @Column(name = "last_name", length = 255)
    private String lastname;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "tin", length = 255)
    private String tin;

    @Column(name = "nin", length = 255)
    private String nin;

    

    public User() {
    }



    public User(int userid, String firstname, String lastname, String email, String password, String tin, String nin) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.tin = tin;
        this.nin = nin;
    }



    public int getUserid() {
        return userid;
    }



    public void setUserid(int userid) {
        this.userid = userid;
    }



    public String getFirstname() {
        return firstname;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastname() {
        return lastname;
    }



    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public String getTin() {
        return tin;
    }



    public void setTin(String tin) {
        this.tin = tin;
    }



    public String getNin() {
        return nin;
    }



    public void setNin(String nin) {
        this.nin = nin;
    }

    
    



}
