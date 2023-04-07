package com.duyi.thymeleaf.springbootthymeleafdemo.controller;

import com.duyi.thymeleaf.springbootthymeleafdemo.bean.Guest;
import com.duyi.thymeleaf.springbootthymeleafdemo.service.GuestService;
import com.duyi.thymeleaf.springbootthymeleafdemo.service.GuestServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//业务控制类 返回视图
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/list")
    public String list(Model model){

//        ModelAndView mv = new ModelAndView();
//        mv.addObject("guestlist",guestService.list());
//        mv.setViewName("list");
//        return mv;

        /**
         * 下面是通过Model方法传入的视图界面参数
         */
        model.addAttribute("guestlist",guestService.list());
        return "list";
    }


    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:list";
    }

    @RequestMapping("/guest/toupdate")
    public String toUpdate(Model model,String name){
        model.addAttribute("name",name);
        return "update";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:list";
    }




}
