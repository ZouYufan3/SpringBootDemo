package com.duyi.thymeleaf.springbootthymeleafdemo.controller;

import com.duyi.thymeleaf.springbootthymeleafdemo.bean.Guest;
import com.duyi.thymeleaf.springbootthymeleafdemo.service.GuestService;
import com.duyi.thymeleaf.springbootthymeleafdemo.service.GuestServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

//业务控制类 返回视图
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

//    @RequestMapping("/guest/list")
//    @RequestMapping(method = RequestMethod.GET)   下面是简便写法
    @GetMapping
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


//    @RequestMapping("/guest/toAdd")
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

//    @RequestMapping("/guest/add")
    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

//    @RequestMapping("/guest/delete")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }

//    @RequestMapping("/guest/toupdate")
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        model.addAttribute("name",name);
        return "update";
    }
//    @RequestMapping("/guest/update")
    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }




}
