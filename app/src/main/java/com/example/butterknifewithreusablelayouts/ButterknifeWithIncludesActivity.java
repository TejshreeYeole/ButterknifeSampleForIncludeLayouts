package com.example.butterknifewithreusablelayouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tejshreey on 18-Oct-17.
 */

public class ButterknifeWithIncludesActivity extends AppCompatActivity {

    //1.Declaring the include layouts
    @BindView(R.id.layout_user1)
    View layoutUser1;
    @BindView(R.id.layout_user2)
    View layoutUser2;
    @BindView(R.id.layout_user3)
    View layoutUser3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withincludes);
        init();
    }

    private void init() {
        //2. Bind the included view
        ButterKnife.bind(this);

        //4. Create instance of the class
        IncludeLayoutModel layoutModel1=new IncludeLayoutModel();
        IncludeLayoutModel layoutModel2=new IncludeLayoutModel();
        IncludeLayoutModel layoutModel3=new IncludeLayoutModel();

        //5. Bind those class instance with the layout within which it has to inflate
        ButterKnife.bind(layoutModel1,layoutUser1);
        ButterKnife.bind(layoutModel2,layoutUser2);
        ButterKnife.bind(layoutModel3,layoutUser3);

        //6. Do the required operations
        layoutModel1.tvTitle.setText("Mary's Details");
        layoutModel1.btnAction.setText("Fetch Mary's Details");
        layoutModel1.btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButterknifeWithIncludesActivity.this,"Roll No : 1 \nName : Mary \nMarks : 89",Toast.LENGTH_SHORT).show();
            }
        });

        layoutModel2.tvTitle.setText("John's Details");
        layoutModel2.btnAction.setText("Fetch John's Details");
        layoutModel2.btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButterknifeWithIncludesActivity.this,"Roll No : 2 \nName : John \nMarks : 70",Toast.LENGTH_SHORT).show();
            }
        });

        layoutModel3.tvTitle.setText("Jack's Details");
        layoutModel3.btnAction.setText("Fetch Jack's Details");
        layoutModel3.btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButterknifeWithIncludesActivity.this,"Roll No : 3 \nName : Jack \nMarks : 85",Toast.LENGTH_SHORT).show();
            }
        });
    }

    //3. create model for the included view layout
    static class IncludeLayoutModel{

        @BindView(R.id.tv_title)
        TextView tvTitle;

        @BindView(R.id.btn_action)
        Button btnAction;
    }
}
