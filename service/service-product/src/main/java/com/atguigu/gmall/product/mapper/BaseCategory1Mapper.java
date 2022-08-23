package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import zipkin2.Call;

/**
 * @author kyrie
 * @create 2022-08-23-18:42
 * 为了让操作数据库的mapper组件放在容器中
 *
 */
//@Mapper //告诉springboot这是一个mapper组件，这个组件已经加入到spring容器中了
public interface BaseCategory1Mapper extends BaseMapper<BaseCategory1> {
}
