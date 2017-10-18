package com.zperkowski.instagramtv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseFragment;
import android.support.v17.leanback.widget.ArrayObjectAdapter;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ListRowPresenter;
import android.util.Log;

/**
 * Created by zperkowski on 15/10/2017.
 */

public class HomeFragment extends BrowseFragment {
    final static private String TAG = "HomeFragment";
    private ArrayObjectAdapter mRowsAdapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated()");
        super.onActivityCreated(savedInstanceState);

        setupUI();
        loadRows();
    }

    private void setupUI() {
        setTitle(getString(R.string.app_name));
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);
    }

    private void loadRows() {
        mRowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());

        HeaderItem gridItemPresenterHeader = new HeaderItem(0, "GridItemPresenter");

        GridItemPresenter gridItemPresenter = new GridItemPresenter();
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(gridItemPresenter);
        arrayObjectAdapter.add("ITEM 1");
        arrayObjectAdapter.add("ITEM 2");
        arrayObjectAdapter.add("ITEM 3");
        mRowsAdapter.add(new ListRow(gridItemPresenterHeader, arrayObjectAdapter));

        setAdapter(mRowsAdapter);
    }
}
