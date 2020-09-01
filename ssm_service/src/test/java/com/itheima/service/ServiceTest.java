package com.itheima.service;

import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService=(ItemsService) ac.getBean("itemsServiceImpl");
        Items items=new Items();
        items.setName("dior");//商品名称
        items.setCreatetime(new Date());//时间
        items.setPrice(998f);//价格
        items.setPic("1.jpg");
        items.setDetail("高品质");
        itemsService.save(items);

        List<Items> list = itemsService.list();
        for (Items i : list) {
            System.out.println(i);
        }

    }





}
