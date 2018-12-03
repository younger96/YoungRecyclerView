package com.example.a47420.youngrecyclerview.common;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * 2018/12/3
 * from 陈秋阳
 * 功能描述：
 */
public class CommAdapTest extends CommonAdapter {
    public CommAdapTest(Context context, int layoutId, List datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(CommonViewHolder holder, Object o, int position) {

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }
}
