package com.cubeGo.common;

import com.cubeGo.common.beans.User;
import com.cubeGo.common.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sunyao on 10/14/16.
 */
@Controller
public class LoginController {
    @Resource
    private ILoginService loginServiceImpl;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest req,User user){
        ModelAndView mv = new ModelAndView();
        User u=loginServiceImpl.Login(user.getUsername(), user.getPassword());
        System.out.println(Contants.username);
        if(u != null){
            req.getSession().setAttribute("user", u);
            mv.addObject("password", u.getPassword());
            System.out.println(u.getPassword());
        }
        mv.setViewName("/index");
        return mv;
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest req){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("/index");
        return mv;
    }

}