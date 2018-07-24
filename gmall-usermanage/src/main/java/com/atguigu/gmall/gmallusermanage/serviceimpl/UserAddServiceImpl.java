package com.atguigu.gmall.gmallusermanage.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.gmallusermanage.mapper.UserAddMapper;
import com.atguigu.gmall.service.UserAddService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserAddServiceImpl implements UserAddService {
    @Autowired
    UserAddMapper userAddMapper;


    @Override
    public List<UserAddress> getUserAddressList(String useriId) {

        List<UserAddress> addressList = null;
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(useriId);
        addressList = userAddMapper.select(userAddress);
        return addressList;
    }
}
