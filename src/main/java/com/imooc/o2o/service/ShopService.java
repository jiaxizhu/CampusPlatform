package com.imooc.o2o.service;

import java.io.InputStream;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

public interface ShopService {
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;

	Shop getByShopId(long shopId);

	ShopExecution modifyShop(Shop shop, InputStream shopImgInputStream, String fileName) throws RuntimeException;
	
	public ShopExecution getShopList(Shop shopCondition,int pageIndex, int pageSize);

}
