package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserAddService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAddController {

    @Reference
    UserAddService userAddService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> getUserAddressList(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList =
                userAddService.getUserAddressList(userId);
        return userAddressList;
    }
}
