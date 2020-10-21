package com.example.dateandtime;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView)findViewById(R.id.textView);
    }
    public void onClick (View view) {
        Date date= new Date();
        textView.setText("Today is ;"+date.toString() );
        Toast.makeText(this,"You clicked Button", Toast.LENGTH_LONG).show();}
}