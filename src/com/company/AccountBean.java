package com.company;

public class AccountBean {
    private int id;
    private String littleName;
    private String email;
    private String address;
    private Birthday birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLittleName() {
        return littleName;
    }

    public void setLittleName(String littleName) {
        this.littleName = littleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

}
