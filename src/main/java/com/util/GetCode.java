package com.util;

import java.util.Random;

/**产生随机验证码*/
public class GetCode {
    public static String phonecode(){
        String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
        System.out.println("您的验证码为："+verifyCode+",请勿告诉他人！");
        return verifyCode;
    }
}