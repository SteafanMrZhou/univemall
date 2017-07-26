package com.univmall.service;

import com.github.pagehelper.PageInfo;
import com.univmall.common.ServerResponse;
import com.univmall.pojo.Product;
import com.univmall.vo.ProductDetailVo;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

}
