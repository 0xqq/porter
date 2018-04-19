package com.suixingpay.datas.manager.core.mapper;

import com.suixingpay.datas.manager.core.entity.CMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单目录表 Mapper接口
 *
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
public interface CMenuMapper {

    List<CMenu> findByFatherCode(String fatherCode);

    List<CMenu> findAll();

    List<CMenu> findByRoleCode(@Param("roleCode") String roleCode);

    Integer insert(CMenu cMenu);

    Integer update(@Param("id") Long id, @Param("cMenu") CMenu cMenu);

    CMenu findById(Long id);

    Integer delete(Long id);
}