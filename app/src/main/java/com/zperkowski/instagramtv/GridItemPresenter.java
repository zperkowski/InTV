package com.zperkowski.instagramtv;

import android.graphics.Color;
import android.support.v17.leanback.widget.Presenter;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zperkowski on 18/10/2017.
 */

public class GridItemPresenter extends Presenter {
    private static final int GRID_ITEM_WIDTH = 300, GRID_ITEM_HEIGHT = 200;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(GRID_ITEM_WIDTH, GRID_ITEM_HEIGHT));
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setBackgroundColor(parent.getResources().getColor(R.color.lb_default_brand_color_dark));
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);
        return new ViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        ((TextView) viewHolder.view).setText((String) item);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }
}
