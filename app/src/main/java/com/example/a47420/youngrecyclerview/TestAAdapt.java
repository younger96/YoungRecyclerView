package com.example.a47420.youngrecyclerview;

import android.content.Context;

import com.example.a47420.youngrecyclerview.common.MultiItemTypeAdapter;

import java.util.List;

/**
 * 2018/12/3
 * from 陈秋阳
 * 功能描述：
 */
public class TestAAdapt extends MultiItemTypeAdapter<String> {
    public TestAAdapt(Context context, List<String> datas) {

        super(context, datas);
        addItemViewDelegate(new TestDelegate());
        addItemViewDelegate(new TestDelegate2());
    }
}
