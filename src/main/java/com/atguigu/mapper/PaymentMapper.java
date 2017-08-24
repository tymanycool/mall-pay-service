package com.atguigu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.atguigu.bean.Payment;
import com.atguigu.bean.PaymentExample;

public interface PaymentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);


    Payment selectByPrimaryKey(Long id);
    
    Payment selectByTradeNo(String outTradeNo);



    int updateByPrimaryKeySelective(Payment record);
    
    int updateByTradeNoSelective(Payment record);

    int updateByPrimaryKey(Payment record);
}