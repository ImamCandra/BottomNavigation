package com.ceks.bottomnavigation;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private ArrayList<TesFragment> fragments = new ArrayList<>();
    private TesFragment currentFragment;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments.clear();
        fragments.add(TesFragment.newInstance(0));
        fragments.add(TesFragment.newInstance(1));
        fragments.add(TesFragment.newInstance(2));
        fragments.add(TesFragment.newInstance(3));
        fragments.add(TesFragment.newInstance(4));
    }

    @Override
    public TesFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        if (getCurrentFragment() != object) {
            currentFragment = ((TesFragment) object);
        }
        super.setPrimaryItem(container, position, object);
    }

    /**
     * Get the current fragment
     */
    public TesFragment getCurrentFragment() {
        return currentFragment;
    }

}
