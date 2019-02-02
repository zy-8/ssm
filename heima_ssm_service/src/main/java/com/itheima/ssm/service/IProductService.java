package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    //保存
    void save(Product product) throws Exception;

    //查询
    public List<Product> findAll() throws Exception;
}
