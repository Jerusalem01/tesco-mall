package com.jerusalem.third;

import com.jerusalem.third.component.SmsComponent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/****
 * @Author: jerusalem
 * @Description: TescoThirdServiceApplicationTest
 * @Date 2020/9/22 16:02
 *****/
@SpringBootTest
public class TescoThirdServiceApplicationTest {

//    /***
//     * 短信验证码测试
//     */
//    @Autowired
//    SmsComponent smsComponent;
//
//    @Test
//    public void sendCode(){
//        smsComponent.sendSmsCode("15704312766","code:789889");
//    }

    @Test
    public void password(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }
}
