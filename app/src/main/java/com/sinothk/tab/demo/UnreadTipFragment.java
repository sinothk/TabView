package com.sinothk.tab.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * <pre>
 *  创建:  LiangYT 2018/5/21/021 on 10:40
 *  项目: TabViewLib
 *  描述:
 *  更新:
 * <pre>
 */
public class UnreadTipFragment extends Fragment {
    public static Fragment newInstance(String s) {
        return new UnreadTipFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.unread_num_layout, null);
    }
}
