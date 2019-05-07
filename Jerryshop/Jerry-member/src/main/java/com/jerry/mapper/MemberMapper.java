package com.jerry.mapper;
import com.jerry.entity.Member;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MemberMapper {
    Member selectByPrimaryKey(int id);
    Member selectByUserName(String userName);
    int deleteByPrimaryKey(int id);
    int updataByPrimaryKey(int id);
    int addMember(Member member);
}
