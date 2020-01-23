package com.sinothk.tab.weiXin;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/28 0028.
 */

public class WxTabMenuMainAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener {

    AlphaTabsIndicator alphaTabsIndicator;
    private List<Fragment> fragments = new ArrayList<>();

    public WxTabMenuMainAdapter(FragmentManager fm, AlphaTabsIndicator alphaTabsIndicator, List<Fragment> fs) {
        super(fm);
        this.alphaTabsIndicator = alphaTabsIndicator;

        this.fragments.clear();
        this.fragments.addAll(fs);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
//        if (0 == position) {
//            alphaTabsIndicator.getTabView(0).showNumber(alphaTabsIndicator.getTabView(0).getBadgeNumber() - 1);
//        } else if (2 == position) {
//            alphaTabsIndicator.getCurrentItemView().removeShow();
//        } else if (3 == position) {
//            alphaTabsIndicator.removeAllBadge();
//        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
