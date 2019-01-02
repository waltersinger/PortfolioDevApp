package com.wsinger.mydeveloperportfolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wsinger.mydeveloperportfolio.controllers.MyPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        Button buttonCall = findViewById(R.id.button_getintouch);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Llamando...", Toast.LENGTH_SHORT).show();
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getResources().getString(R.string.my_phonenumer)));
                startActivity(intentCall);
            }
        });

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        //la siguiente es una alternativa, se va a mostrar texto de cada tab que esta especificado en el adapter del pager,
        //lo que quiero es mostrar mis propios tabItems
        // tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabTextColors(Color.WHITE,Color.parseColor("#FFEB3B"));
    }


}
