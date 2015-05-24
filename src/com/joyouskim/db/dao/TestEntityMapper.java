package com.joyouskim.db.dao;

import com.joyouskim.db.dao.TestEntity;
import com.joyouskim.db.dao.TestEntityExample;
import com.joyouskim.db.dao.TestEntityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestEntityMapper {
    int countByExample(TestEntityExample example);

    int deleteByExample(TestEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TestEntityWithBLOBs record);

    int insertSelective(TestEntityWithBLOBs record);

    List<TestEntityWithBLOBs> selectByExampleWithBLOBs(TestEntityExample example);

    List<TestEntity> selectByExample(TestEntityExample example);

    TestEntityWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TestEntityWithBLOBs record, @Param("example") TestEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") TestEntityWithBLOBs record, @Param("example") TestEntityExample example);

    int updateByExample(@Param("record") TestEntity record, @Param("example") TestEntityExample example);

    int updateByPrimaryKeySelective(TestEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestEntityWithBLOBs record);

    int updateByPrimaryKey(TestEntity record);
}