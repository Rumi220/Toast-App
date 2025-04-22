package com.example.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView tv;
int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textbody);


        }


    public void toast(View view) {
        Toast.makeText(this, tv.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {
        i++;
        tv.setText(String.valueOf(i));
    }
}


