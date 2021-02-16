package com.imooc.o2o.service;

import java.util.List;

import com.imooc.o2o.dto.ProductCategoryExecution;
import com.imooc.o2o.entity.ProductCategory;
import com.imooc.o2o.exceptions.ProductCategoryOperationException;

public interface ProductCategoryService {
    /**
     * 查询指定某个店铺下所有商品类别信息
     */
    List<ProductCategory> getProductCategoryList(long shopId);
    
    ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
            throws ProductCategoryOperationException;
    
    ProductCategoryExecution deleteProductCategory(long productCategoryId,
            long shopId) throws ProductCategoryOperationException;
}