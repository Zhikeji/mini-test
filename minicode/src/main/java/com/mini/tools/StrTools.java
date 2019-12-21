package com.mini.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZhiKeji on 2019/12/21 0021.
 */
public class StrTools {

    private static final String node[][] = {{""},
            {""}, {"a", "b", "c"}, {"d", "e", "f"},
            {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
            {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};

    /**
     * @param param
     * @return List
     * param < 10, 取node[params]
     * param >= 10, 分别取node[param十位数]，node[param个位数]
     */
    public static List<String> getListByParam(int param) {
        List<String> list = new ArrayList<>();
        if (param < 0 || param > 99) {
            list.add("");
            return list;
        }

        if (param < 10) {
            String[] arr = node[param];
            Collections.addAll(list, arr);
        } else {
            List<String> tensDigit = getListByParam(param / 10);
            List<String> unitDigit = getListByParam(param % 10);

            List<String> result = new ArrayList<>();
            for (String e1 : tensDigit) {
                for (String e2 : unitDigit) {
                    result.add(e1 + e2);
                }
            }
            list = result;
        }
        return list;
    }
}
