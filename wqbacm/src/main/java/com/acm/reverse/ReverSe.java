package com.acm.reverse;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/2.
 */
public class ReverSe {
    @Test
    public void stringreverse() {
        String s = "123456789";
        System.out.println(reserve1(s));
    }

    public String reserve1(String s) {
        int length = s.length();
        if (length <= 1) {
            return s;
        }
        String left = s.substring(0, length / 2);
        String right = s.substring(length / 2, length);
        return reserve1(right) + reserve1(left);
    }
}
