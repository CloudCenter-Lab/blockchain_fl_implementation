package com.blockChain.demo.domain;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 用户表
 * @TableName sys_user
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty("用户ID")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("用户密码")
    private String password;

    /**
     * 邮箱
     */
    @ApiModelProperty("用户邮箱")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("电话号码")
    private String phone;

    /**
     * 用户性别（0男，1女，2未知）
     */
    @ApiModelProperty("用户性别")
    private String sex;


    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @ApiModelProperty("是否删除")
    private Integer delFlag;





}
