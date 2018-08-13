package com.example.palash.basicbuttonoperation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    TextView showText ;
    Button okButton,nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.showTextView);
        okButton = (Button) findViewById(R.id.button1);
        nextButton = (Button) findViewById(R.id.button2);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickText.setText("how easy to learn!!!");
                Toast.makeText(MainActivity.this,
                        "Your clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,nextPage.class);
                startActivity(intent);
            }
        });
    }
}
