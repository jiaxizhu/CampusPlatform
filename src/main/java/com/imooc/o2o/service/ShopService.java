package com.imooc.o2o.service;


import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

public interface ShopService {
	ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

	Shop getByShopId(long shopId);

	ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
	
	public ShopExecution getShopList(Shop shopCondition,int pageIndex, int pageSize);

}
