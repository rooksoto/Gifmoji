package com.abasscodes.gifmoji;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abasscodes.gifmoji.model.api.ApiClient;

public class MainActivity extends AppCompatActivity implements Mvc.Controller {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiClient.getInstance().getRandomGiphy();
    }

    @Override
    public void showTheGiphy(String mpyUrl) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.main_frame_layout, null).commit();
    }
}
