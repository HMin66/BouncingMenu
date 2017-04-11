package com.huangmin66.bouncingmenu;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 描述：
 * 作者： 天天童话丶
 * 时间： 2017/4/11.
 */
public class MyRecyclerViewAdapter extends BaseQuickAdapter<String> {

    public MyRecyclerViewAdapter(List<String> data) {
        super(R.layout.layout_item, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, String s) {
        holder.setText(R.id.tv_item, s);
    }
}
