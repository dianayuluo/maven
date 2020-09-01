package com.itheima.dao;

import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
       ItemsDao itemsDao=(ItemsDao)ac.getBean("itemsDao");
        Items items=new Items();
        items.setName("杨紫");
        items.setCreatetime(new Date());
        items.setPrice(18888f);
        items.setPic("1.jpg");
        items.setDetail("演员");
        itemsDao.save(items);

        List<Items> list = itemsDao.list();
        for (Items i : list) {
            System.out.println(i);
        }

    }
}
