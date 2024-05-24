package com.example.lab_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        txt = findViewById(R.id.txt_data);

        Intent i = getIntent();

        String s = i.getStringExtra("abc");
        txt.setText(s);
    };

    public void on_cancel(View v)
    {

        setResult(RESULT_CANCELED);
        finish();
    }

    public void on_ok(View v)
    {
        Intent i = new Intent();
        String s = txt.getText().toString();
        i.putExtra("qwe",s);
        setResult(RESULT_OK, i);
        finish();
    }






}