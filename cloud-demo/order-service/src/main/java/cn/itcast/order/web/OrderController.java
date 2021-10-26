package cn.itcast.order.web;

import cn.itcast.order.config.ConfigProperties;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;

@RestController
@RequestMapping("order")
//@RefreshScope
public class OrderController {
//    @Value("${common.name}")
//    private String name;
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @Autowired
    private OrderService orderService;
    @Autowired
    ConfigProperties properties;


    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }

    @GetMapping("/config")
    public String getConfig(@MatrixVariable Long id){
        System.out.println(properties.getName());
        String property = applicationContext.getEnvironment().getProperty("common.name");
        return properties.getName()+":"+property;
    }
}
