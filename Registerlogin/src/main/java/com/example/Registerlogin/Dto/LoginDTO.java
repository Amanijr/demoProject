package com.example.Registerlogin.Dto;

public class LoginDTO {

    private String tin;
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String tin, String password) {
        this.tin = tin;
        this.password = password;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "tin='" + tin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
