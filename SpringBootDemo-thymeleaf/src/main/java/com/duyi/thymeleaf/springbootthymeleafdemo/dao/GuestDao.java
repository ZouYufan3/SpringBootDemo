package com.duyi.thymeleaf.springbootthymeleafdemo.dao;

import com.duyi.thymeleaf.springbootthymeleafdemo.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
    static private List<Guest> guestList = new ArrayList<>();   //静态的目的是为了数据持久
    static {
        guestList.add(new Guest("01","安好"));
        guestList.add(new Guest("02","快捷键不好使了"));
        guestList.add(new Guest("03", "我服了"));
        guestList.add(new Guest("04","。。。"));
    }
    public static List<Guest> list(){
        return guestList;
    }

    public void add(Guest guest){
        guestList.add(guest);
    }

    public void delete(String name){
        for (int i = 0; i < guestList.size(); i++){
            if (name.equals(guestList.get(i).getName()))
                guestList.remove(i);
        }
//        for (Guest guest:guestList) {
//            if (name.equals(guest.getName()))
//                guestList.remove(guest);
//        }
    }

    public void update(Guest guest){
        for (int i = 0; i < guestList.size(); i++){
            if (guest.getName().equals(guestList.get(i).getName()))
                guestList.set(i,guest);
        }
    }




}
