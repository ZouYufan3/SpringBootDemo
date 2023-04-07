package com.duyi.thymeleaf.springbootthymeleafdemo.bean;


import lombok.Data;

@Data
public class Guest {
    private String name;    //名字
    private String role;    //角色

    public Guest(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
