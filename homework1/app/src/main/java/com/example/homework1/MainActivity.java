package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        String[]city=new String[]{"秦皇岛","石家庄","北京","上海"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,city);
        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

    }
}
