package com.ibli.sharding.simple.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * member
 * @author gaolei
 */
@Data
public class Member {
    /**
     * 
     */
    private Long memberId;

    /**
     * 
     */
    private String nickName;

    /**
     * 
     */
    private Integer accountNo;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String birthday;

    /**
     * 
     */
    private String delFlag;
}