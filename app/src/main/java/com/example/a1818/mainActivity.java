package com.example.a1818;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView walk = (ImageView) findViewById(R.id.view);
        ImageView charge = (ImageView) findViewById(R.id.charge);
        ImageView calender = (ImageView) findViewById(R.id.calender);
        ImageView running = (ImageView) findViewById(R.id.running);
        ImageView bell = (ImageView) findViewById(R.id.bell);


        LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
        LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
        LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);
        LinearLayout button4 = (LinearLayout) findViewById(R.id.button4);



        walk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playActivity = new Intent(v.getContext(),playActivity.class);
                startActivity(playActivity);


            }
        });
        charge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playActivity = new Intent(v.getContext(),playActivity.class);
                startActivity(playActivity);


            }
        });
        calender.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playActivity = new Intent(v.getContext(),playActivity.class);
                startActivity(playActivity);


            }
        });
        running.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playActivity = new Intent(v.getContext(),playActivity.class);
                startActivity(playActivity);


            }
        });
        bell.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playActivity = new Intent(v.getContext(),playActivity.class);
                startActivity(playActivity);


            }
        });
















        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent routinActivity = new Intent(v.getContext(),routinActivity.class);
                startActivity(routinActivity);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heart = new Intent(v.getContext(),playActivity.class);
                startActivity(heart);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(v.getContext(),playActivity.class);
                startActivity(quiz);


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(v.getContext(),playActivity.class);
                startActivity(quiz);


            }
        });

    }
}
