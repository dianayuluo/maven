package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
private ItemsDao itemsDao;

    public List<Items> list() {
        return itemsDao.list();
    }

    public int save(Items items) {
        return itemsDao.save(items);
    }
}
