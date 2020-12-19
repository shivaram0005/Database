package com.example.insertdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DataBase dataBase;
    EditText et1,et2,et3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        b1=(Button)findViewById(R.id.b1);
        dataBase=new DataBase(this);
        addData();
    }
    public void addData(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            boolean isInserted=    dataBase.insertData(et1.getText().toString(),et2.getText().toString(),et3.getText().toString());
            if(isInserted=true)
            {
                Toast.makeText(MainActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Data not inserted ", Toast.LENGTH_SHORT).show();
            }

            }
        });
    }
}