package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserAddService {
    public List<UserAddress> getUserAddressList(String useriId);
}
