package com.example.toggleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle_img_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle_img_btn=findViewById(R.id.toggle_img_btn);
        toggle_img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle_img_btn.isChecked())
                {
                    toggle_img_btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.mood));
                    Toast.makeText(getApplicationContext(), "toggle worked", Toast.LENGTH_LONG).show();

                }
                else{
                    toggle_img_btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_baseline_mouse_24));
                    Toast.makeText(getApplicationContext(), "toggle back", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}