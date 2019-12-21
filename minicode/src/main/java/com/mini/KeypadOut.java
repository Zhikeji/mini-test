package com.mini;

import com.mini.tools.StrTools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhiKeji on 2019/12/20 0020.
 */
public class KeypadOut {

    private List<String> keypadOuts;

    public List<String> entrance(int[] params) {
        keypadOuts = new ArrayList<String>();
        maker(params, 0, "");
        return keypadOuts;
    }


    public void maker(int[] params, int index, String str) {
        if (index >= params.length) {
            keypadOuts.add(str);
            return;
        }

        List<String> possibilities = StrTools.getListByParam(params[index]);

        for (int i = 0; i < possibilities.size(); i++) {
            String tmp = str + possibilities.get(i);
            maker(params, index + 1, tmp);
        }
    }
}
