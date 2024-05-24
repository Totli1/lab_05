package com.example.lab_06;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.txt_data);
    };

    public void on_exit(View v)
    {
        finish();
    }

    public void on_dialog(View v)
    {
        String s = txt.getText().toString();
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("abc",s);
        startActivityForResult(i, 555);
    }

    public void on_result(int requsest, int resultCode, @Nullable Intent data)
    {
        if (resultCode == 555)
        {
            if (data !=null)
            {
                String s = data.getStringExtra("qwe");
                Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

            }
        }
        super.onActivityResult(resultCode,requsest, data);
    }

}