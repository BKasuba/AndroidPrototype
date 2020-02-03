package com.example.appprototype4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList output = new ArrayList();
        ListView list = this.findViewById(R.id.mainList);
        TextView tv = this.findViewById(R.id.textView);


        String[] times = new String[]{
                "9:00-", "10:00-", "11:00-", "12:00-", "13:00-", "14:00-", "15:00-", "16:00-", "17:00 - ", "18:00 - ", "19:00 - ", "20:00 - "
        };
        Data d = new Data();
        tv.setText("---" + d.fetchData(getApplicationContext()));

        String[] events = new String[]{};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,times);
        list.setAdapter(arrayAdapter);

    }



}
