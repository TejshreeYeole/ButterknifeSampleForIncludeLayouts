package com.example.butterknifewithreusablelayouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //1. Declare the layout views
    @BindView(R.id.tv_pagetitle)
    TextView tvPagetitle;
    @BindView(R.id.btn_action)
    Button btnAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //2.Bind the view
        ButterKnife.bind(this);

        //3 . Use them
        tvPagetitle.setText("ButterKnife Example");
        btnAction.setText("Click to load next activity");
    }

    // 4. Directly using OnClick of butterknife to handle click event on button
    @OnClick(R.id.btn_action)
    public void loadNextActivity(){
        startActivity(new Intent(MainActivity.this,ButterknifeWithIncludesActivity.class));
    }
}
