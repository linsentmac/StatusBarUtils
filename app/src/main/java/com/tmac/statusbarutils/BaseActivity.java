package com.tmac.statusbarutils;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    protected TextView tv_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusUtils.setWindowLayout(getWindow());
        super.onCreate(savedInstanceState);

        tv_status = (TextView) findViewById(R.id.tv_status);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            tv_status.setHeight(StatusUtils.getStatusHeight(this));
            tv_status.setVisibility(View.VISIBLE);
        } else {
            tv_status.setHeight(0);
            tv_status.setVisibility(View.GONE);
        }
    }



}
