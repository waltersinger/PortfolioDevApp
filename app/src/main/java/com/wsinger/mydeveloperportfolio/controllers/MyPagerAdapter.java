package com.wsinger.mydeveloperportfolio.controllers;

import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wsinger.mydeveloperportfolio.views.AboutFragment;
import com.wsinger.mydeveloperportfolio.views.ContactFragment;
import com.wsinger.mydeveloperportfolio.views.SkillsFragment;
import com.wsinger.mydeveloperportfolio.views.WorkFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
/*
    este es una alternativa que funciona junto con tabLayout.setupWithViewPager(viewPager);
    lo que quiero es mostrar mis tabitems
    @Override
    public CharSequence getPageTitle(int position) {


        switch (position){
           case 0: return "PERFIL";
           case 1: return "EXPERIENCIA";
           case 2: return "HABILIDADES";
           case 3: return "CONTACTO";
        }

        return super.getPageTitle(position);

    }*/
}
