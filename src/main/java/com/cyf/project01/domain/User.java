package com.cyf.project01.domain;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {

    private Integer id;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String password;
    @NotNull
    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
