package com.yao.customradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MultiLineRadioGroup.OnCheckedChangedListener {

    private MultiLineRadioGroup group;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_show);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, group.getCheckedValues().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        group = (MultiLineRadioGroup) findViewById(R.id.content);
        group.setOnCheckChangedListener(this);
        group.setChoiceMode(false);
    }


    @Override
    public void onItemChecked(MultiLineRadioGroup group, int position, boolean checked) {
        Toast.makeText(this, "haha", Toast.LENGTH_SHORT).show();
        if (checked) {
            this.group = group;
            Log.i("group.getChecked", String.valueOf(group.getCheckedValues()));
        }
    }
}
