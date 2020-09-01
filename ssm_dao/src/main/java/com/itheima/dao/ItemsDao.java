package com.itheima.dao;



import com.itheima.pojo.Items;


import java.util.List;

public interface ItemsDao {
    public List<Items> list();

    public int save(Items items);
}
