package com.ibli.sharding.simple.service;

import com.ibli.sharding.simple.domain.Member;
import org.springframework.stereotype.Service;

/**
 * @Author gaolei
 * @Date 2021/8/27 下午8:00
 * @Version 1.0
 */
@Service
public interface IMemberService {
    int insert(Member record);

    Member selectByPrimaryKey(Long memberId);

    int deleteByPrimaryKey(Long memberId);
}
