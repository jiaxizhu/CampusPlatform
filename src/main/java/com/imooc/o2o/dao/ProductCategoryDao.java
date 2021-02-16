package com.imooc.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.ProductCategory;

public interface ProductCategoryDao {
    /**
     * 通过商品shop id 查询店铺商品类别
     * @return
     */
    List<ProductCategory> queryProductCategoryList(long shopId);
    
    /**
     *批量新增商品类别
     */
    int batchInsertProductCategory(List<ProductCategory> productCategoryList);
    
    int deleteProductCategory(@Param("productCategoryId")long productCategoryId,@Param("shopId")long shopId);
}