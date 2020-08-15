package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Home extends AppCompatActivity {

    public Button button , button2 , button3 , button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (Button) findViewById(R.id.btn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Mathsquiz.class);
                startActivity(intent);
            }
        });

        button2 = (Button)findViewById(R.id.btn4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inten2 = new Intent(Home.this, Editprofile.class);
                startActivity(inten2);

            }
        });

        button3 = (Button)findViewById(R.id.btn10);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inten3 = new Intent(Home.this, CreateQuiz.class);
                startActivity(inten3);

            }
        });

        button4 = (Button)findViewById(R.id.btn11);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inten4 = new Intent(Home.this, EditSeclectQuiz.class);
                startActivity(inten4);

            }
        });



    }
}