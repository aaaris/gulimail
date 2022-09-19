package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2022-09-19 18:03:18
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
