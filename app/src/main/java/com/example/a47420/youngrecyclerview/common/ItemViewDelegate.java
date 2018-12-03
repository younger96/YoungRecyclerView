package com.example.a47420.youngrecyclerview.common;


public interface ItemViewDelegate<T> {

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(CommonViewHolder holder, T t, int position);

}