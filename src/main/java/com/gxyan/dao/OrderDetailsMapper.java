package com.gxyan.dao;

import com.gxyan.pojo.OrderDetails;
import com.gxyan.vo.Details;

import java.util.List;

public interface OrderDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);

    List<OrderDetails> selectByOrderId(Long orderId);

    List<Details> selectDetailsByOrderId(Long orderId);
}