package com.util;

import java.util.regex.Pattern;

/**
 * 判断用户输入的邮箱是否符合规则
 * */
//public class JustPhone {
//
//    public static boolean justPhone(String phoneNum){
//        if(phoneNum.length()!=11){
//            return false;//不符合规则的账号
//        }
//        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
//        if(!pattern.matcher(phoneNum).matches()){//判断是否包含字符
//            return false;//包含字符不是手机号
//        }
//        return true;
//    }
public class JustEmail {

    public static boolean justEmail(String emailNum){
//        if(emailNum.length()!=11){
//            return false;//不符合规则的账号
//        }
//        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
//        if(!pattern.matcher(emailNum).matches()){//判断是否包含字符
//            return false;//包含字符不是手机号
//        }
//        return true;
        if ((emailNum != null) && (!emailNum.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", emailNum);
        }
        return false;
    }
}
