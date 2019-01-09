package com.isoft.controllor;

import com.isoft.pojo.User;
import com.isoft.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControllor {
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(User user){
        UserService userService=new UserService();
        boolean login = userService.login(user);
        return String.valueOf(login);
    }
}
