package com.example.sakshi.combine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    Button button;
    String name;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(this);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

    }



     void insertIntoStudent() {

     }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button){
            name  = editText.getText().toString().trim();
            insertIntoStudent();
        }
    }
}
