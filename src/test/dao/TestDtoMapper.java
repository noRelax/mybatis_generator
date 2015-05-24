package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.TestDto;
import test.model.TestDtoExample;

public interface TestDtoMapper {
    int countByExample(TestDtoExample example);

    int deleteByExample(TestDtoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TestDto record);

    int insertSelective(TestDto record);

    List<TestDto> selectByExampleWithBLOBs(TestDtoExample example);

    List<TestDto> selectByExample(TestDtoExample example);

    TestDto selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TestDto record, @Param("example") TestDtoExample example);

    int updateByExampleWithBLOBs(@Param("record") TestDto record, @Param("example") TestDtoExample example);

    int updateByExample(@Param("record") TestDto record, @Param("example") TestDtoExample example);

    int updateByPrimaryKeySelective(TestDto record);

    int updateByPrimaryKeyWithBLOBs(TestDto record);

    int updateByPrimaryKey(TestDto record);
}