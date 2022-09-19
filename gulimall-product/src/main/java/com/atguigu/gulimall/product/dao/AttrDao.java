package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-09-19 16:04:04
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
