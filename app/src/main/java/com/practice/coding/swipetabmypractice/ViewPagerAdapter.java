package com.practice.coding.swipetabmypractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        /*DemoFragment fragment = new DemoFragment();
        Bundle bundle = new Bundle();
        position = position+1;
        bundle.putString("DATA_KEY", "Fragment : "+position);
        fragment.setArguments(bundle);
       return fragment; */
        // OR

        //return new DemoFragment().newInstance(position+1);

        //OR

        Fragment fragment = null;
        if(position == 0)
        {
            fragment = new DemoFragment().newInstance(position);
        }
        if(position == 1)
        {
            fragment = new FragmentA();
        }

        if(position == 2)
        {
            fragment = new FragmentB();
        }

        return fragment;
    }

    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Fragment : "+position;
    }
}
