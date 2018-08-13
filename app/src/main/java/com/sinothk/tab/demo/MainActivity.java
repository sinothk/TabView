package com.sinothk.tab.demo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.tab.weiXin.AlphaTabsIndicator;
import com.sinothk.tab.weiXin.WxTabMenuMainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AlphaTabsIndicator alphaTabsIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alphaTabsIndicator = (AlphaTabsIndicator) this.findViewById(R.id.alphaIndicator);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(UnreadTipFragment.newInstance(""));
        fragments.add(Test1.newInstance(""));

        ViewPager mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        WxTabMenuMainAdapter mainAdapter = new WxTabMenuMainAdapter(getSupportFragmentManager(), alphaTabsIndicator, fragments);
        mViewPager.setAdapter(mainAdapter);
        mViewPager.addOnPageChangeListener(mainAdapter);
        alphaTabsIndicator.setViewPager(mViewPager);

        // 未读数据提示
        alphaTabsIndicator.getTabView(0).showNumber(144);
//        alphaTabsIndicator.getTabView(1).showNumber(100);
        alphaTabsIndicator.getTabView(1).showPoint();
    }
}
