package com.imooc.o2o.dao;
 
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.Shop;
 
public interface ShopDao {
 
    /**
     * 新增店铺
     * @param shop
     * @return
     */
	Shop queryByShopId(long shopId); 
    int insertShop(Shop shop);
    int updateShop(Shop shop);
    //分页查询店铺，可输入的条件有，店铺名(模糊)查询，店铺状态，店铺类别，区域id，owner
    List<Shop> queryShopList(@Param("shopCondition")Shop shopCondition,
            @Param("rowIndex")int roeIndex,
            @Param("pageSize")int pageSize);
    //返回queryShopList总数
    int queryShopCount(@Param("shopCondition")Shop shopCondition);
}