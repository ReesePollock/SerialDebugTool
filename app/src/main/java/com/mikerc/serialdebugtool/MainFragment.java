package com.mikerc.serialdebugtool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mike on 3/11/17.
 */

public class MainFragment extends Fragment {

    private TextView mData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);

        mData = (TextView) v.findViewById(R.id.tv_data);

        Button connectButton = (Button) v.findViewById(R.id.button_connect);
        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputStream in = new InputStream() {
                    @Override
                    public int read() throws IOException {
                        return 0;
                    }
                }
            }
        });

        return v;
    }
}
