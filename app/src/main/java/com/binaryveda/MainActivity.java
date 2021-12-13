package com.binaryveda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.binaryveda.model.Home;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mRegisterBtn = findViewById(R.id.register_btn);
        recyclerView = findViewById(R.id.main_rv);

        mRegisterBtn.setOnClickListener(v -> {
            // send to next screen
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        });

        createDataSet();
    }

    private void createDataSet() {

        Home home1 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image1);
        Home home2 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image2);
        Home home3 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image3);
        Home home4 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image4);
        Home home5 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image5);
        Home home6 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image6);
        Home home7 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image7);
        Home home8 = new Home(getResources().getString(R.string.lorem_ipsum_nis_used), getResources().getString(R.string.lorem_ipsum_2), R.drawable.ic_image8);

        List<Home> homeList = new ArrayList<>();
        homeList.add(home1);
        homeList.add(home2);
        homeList.add(home3);
        homeList.add(home4);
        homeList.add(home5);
        homeList.add(home6);
        homeList.add(home7);
        homeList.add(home8);

        MainRvAdapter adapter = new MainRvAdapter(homeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

    }
}