package com.binaryveda;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ArrayList<Fragment> fragmentList = new ArrayList<Fragment>() {{
        add(new UploadFragment());
        add(new UploadFragment());
        add(new UploadFragment());
    }};

    private ArrayList<String> titles = new ArrayList<String>() {{
        add("Uploads");
        add("Exhibitions");
        add("Revenue");
    }};

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

}
