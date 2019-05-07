package com.jerry.entity;
import lombok.Data;
@Data
public class Member {

        private Integer id;
        private String userName;//用户名
        private String userNumber;//用户账号
        private String userPassWord;//用户密码
        private String userSex;//性别
        private String registerDate;//注册日期
        private String userEmail;//邮箱
}
