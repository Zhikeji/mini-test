package com.mini;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by ZhiKeji on 2019/12/20 0020.
 */
public class KeypadTest {

    @Test
    public void test1() {
        int[] arr = {2, 3};
        KeypadOut keypadOut = new KeypadOut();
        List<String> result = keypadOut.entrance(arr);
        System.out.println(String.join(",", result));
    }

    @Test
    public void test2() {
        int[] arr = {9};
        KeypadOut keypadOut = new KeypadOut();
        List<String> result = keypadOut.entrance(arr);
        System.out.println(String.join(",", result));
    }

    @Test
    public void test3() {
        int[] arr = {91, 56};
        KeypadOut keypadOut = new KeypadOut();
        List<String> result = keypadOut.entrance(arr);
        System.out.println(String.join(",", result));
        assertTrue( result.size() == 36);
    }
}
