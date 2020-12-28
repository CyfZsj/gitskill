package com.cyf.project01.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserObj extends User{

    @JsonIgnore
    private String password;
}
