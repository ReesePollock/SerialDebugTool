package com.mikerc.serialdebugtool;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by mike on 3/11/17.
 */

public class LoggingFragment extends Fragment {

    protected final String TAG = getClass().getName();


    public LoggingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach(Context) called.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.i(TAG, "onCreateView(LayoutInflater, ViewGroup, Bundle) called.");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }
}
