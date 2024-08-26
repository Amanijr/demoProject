package com.example.Registerlogin.Dto;



public class UserDTO {


    private int userid;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String tin;
    private String nin;

    
    public UserDTO() {
    }


    public UserDTO(int userid, String firstname, String lastname, String email, String password, String tin, String nin) {
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


    @Override
    public String toString() {
        return "UserDTO [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
                + ", password=" + password + ", tin=" + tin + ", nin=" + nin + "]";
    }

    



    

}
