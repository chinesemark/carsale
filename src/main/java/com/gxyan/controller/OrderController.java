package com.gxyan.controller;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.OrderDetails;
import com.gxyan.service.IOrderService;
import com.gxyan.vo.OrderDetailVo;
import com.gxyan.vo.OrderList;
import com.gxyan.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gxyan
 * @date 2018/12/28 17:00
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping(value = "addOrder", method = RequestMethod.POST)
    public ServerResponse addOrder(@RequestBody OrderVo orderVo) {
        return orderService.addOrder(orderVo);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(OrderList orderList) {
        return orderService.getList(orderList);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Long orderId, String status) {
        return orderService.update(orderId, status);
    }

    @RequestMapping(value = "updateDetail", method = RequestMethod.POST)
    public ServerResponse updateDetail(OrderDetails orderDetails) {
        return orderService.updateDetail(orderDetails);
    }
}
