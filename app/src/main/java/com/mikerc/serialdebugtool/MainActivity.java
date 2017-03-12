package com.mikerc.serialdebugtool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created on 3/11/2017 by Kyle
 *
 * Main activity containing a single container to hold an instance of MainFragment
 */
public class MainActivity extends AppCompatActivity {

    public MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_container, mainFragment)
                .commit();
    }
}
