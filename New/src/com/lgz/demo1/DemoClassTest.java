package com.lgz.demo1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 10480;
 */
public class DemoClassTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String timenow = now.format(pattern);
        System.out.println(timenow);
    }
}

