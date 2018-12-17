package com.clinton.testapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Fragments added here
        adapter.AddFragment(new Fragment1(),"");
        adapter.AddFragment(new Fragment2(),"");
        adapter.AddFragment(new Fragment3(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //To display icons
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_mood_smile);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_sentiment_confused);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_sentiment_whut);

        //Remove Action Bar Shadow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
