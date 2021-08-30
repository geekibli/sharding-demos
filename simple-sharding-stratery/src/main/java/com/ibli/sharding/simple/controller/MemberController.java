package com.ibli.sharding.simple.controller;

import com.ibli.sharding.simple.domain.Member;
import com.ibli.sharding.simple.service.IMemberService;
import com.ibli.sharding.simple.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Author gaolei
 * @Date 2021/8/27 下午7:59
 * @Version 1.0
 */
@RequestMapping("/member")
@RestController
public class MemberController {

    @Resource
    private MemberServiceImpl memberServiceImpl;

    @RequestMapping("/add")
    public Member add(){
        Member member = new Member();
        //不用手动设置主键id，新增时，sharding-jdbc会自动赋值，因为在配置文件中配置了该列使用SNOWFLAKE算法生成值
//        member.setMemberId(IdWorker.getLongId());
        member.setNickName("nickname");
        member.setAccountNo(new Date().hashCode());
        member.setPassword(UUID.randomUUID().toString());
        member.setAge(10);
        member.setDelFlag(UUID.randomUUID().toString());
        memberServiceImpl.insert(member);
        return member;
    }

    @RequestMapping("/findById")
    public Member findById(Long memberId){
        return memberServiceImpl.selectByPrimaryKey(memberId);
    }

    @RequestMapping("/delete")
    public String delete(Long memberId){
        memberServiceImpl.deleteByPrimaryKey(memberId);
        return "success";
    }
}


