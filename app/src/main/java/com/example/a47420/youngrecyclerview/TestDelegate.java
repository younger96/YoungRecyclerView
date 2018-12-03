package com.example.a47420.youngrecyclerview;

import android.text.TextUtils;

import com.example.a47420.youngrecyclerview.common.CommonViewHolder;
import com.example.a47420.youngrecyclerview.common.ItemViewDelegate;

/**
 * 2018/12/3
 * from 陈秋阳
 * 功能描述：
 */
public class TestDelegate implements ItemViewDelegate<String> {



    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_linear;
    }

    @Override
    public boolean isForViewType(String item, int position) {
        return position <= 5;
    }

    @Override
    public void convert(CommonViewHolder holder, String s, int position) {
        holder.setText(R.id.adapter_linear_text,s);
    }
}
