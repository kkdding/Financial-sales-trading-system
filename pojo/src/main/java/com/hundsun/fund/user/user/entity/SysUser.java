package com.hundsun.fund.user.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @Author
 * @Date 2024/4/9 13:05
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tuser")
public class SysUser {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long id;//ID
    private String account;//账号
    private String password;//密码
    //private transient String salt;//密码盐
    private String name;//用户名
    private String idNumber;//身份证号码
    private String email;//邮箱
    private String phoneNumber;//手机号
    private String province;//省份
    private String city;//城市
    private String address;//地址
    private int occupation;//职业
    private int industry;//行业
    private String workUnit;//工作单位
    private int educationalBackground;//学历
    private boolean isDishonest;//是否失信
    private int customerType;//客户类型
    private int riskProfile;//风险等级
    private String transactionPassword;//交易密码
    private int accountStatus;//账户状态,0：未激活；1：正常；2：冻结；3：已注销
    private Timestamp lastLogin;//最后登录时间
}