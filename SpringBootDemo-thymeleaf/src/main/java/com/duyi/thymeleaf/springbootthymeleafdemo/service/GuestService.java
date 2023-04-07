package com.duyi.thymeleaf.springbootthymeleafdemo.service;

import com.duyi.thymeleaf.springbootthymeleafdemo.bean.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();

    void add(Guest guest);

    void delete(String name);

    void update(Guest guest);
}
