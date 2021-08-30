package com.ibli.sharding.simple.service.impl;

import com.ibli.sharding.simple.domain.Member;
import com.ibli.sharding.simple.mapper.MemberMapper;
import com.ibli.sharding.simple.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author gaolei
 * @Date 2021/8/27 下午8:00
 * @Version 1.0
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public int insert(Member record) {
        return memberMapper.insertSelective(record);
    }

    @Override
    public Member selectByPrimaryKey(Long memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }

    @Override
    public int deleteByPrimaryKey(Long memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }
}