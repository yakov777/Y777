package com.yak77.la3android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import static com.yak77.la3android.RetainFragment.*;

public class MainActivity extends AppCompatActivity {
    private Fragment retainFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retainFragment =  getSupportFragmentManager().findFragmentByTag(TAG);
        if (retainFragment == null){
            retainFragment = new RetainFragment();
            getSupportFragmentManager().beginTransaction().add(retainFragment, TAG).commit();
        }
    }

}
