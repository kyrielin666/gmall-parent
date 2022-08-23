package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseCategory2;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 46821
* @description 针对表【base_category2(二级分类表)】的数据库操作Service
* @createDate 2022-08-23 21:56:57
*/
public interface BaseCategory2Service extends IService<BaseCategory2> {
    /**
     *
     * @param c1Id 针对表【base_category2(二级分类表)】的数据库操作Service
     * @return
     */
    List<BaseCategory2> getCategory1Child(Long c1Id);
}
