package com.duyi.thymeleaf.springbootthymeleafdemo.service;

import com.duyi.thymeleaf.springbootthymeleafdemo.bean.Guest;
import com.duyi.thymeleaf.springbootthymeleafdemo.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {
    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }
}
