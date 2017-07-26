package com.univmall.service;

import com.univmall.common.ServerResponse;
import com.univmall.pojo.Category;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParalleCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);

}
