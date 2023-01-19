package com.confluxsys.demo.controller;

import com.confluxsys.demo.bean.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")

@RestController
@RequestMapping("/api")
public class Customer_orderController {
    @Autowired
    CustomerOrder customers;

    @PostMapping("/customer_order")
    public void postJsonToJavaObject(@RequestBody CustomerOrder body)
    {

        customers.setName(body.getName());
        customers.setEmail(body.getEmail());
        customers.setMobile(body.getMobile());
        customers.setOrderItemsList(body.getOrderItemsList());

        System.out.println(customers.toString());
    }
}

