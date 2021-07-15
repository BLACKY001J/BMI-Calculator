package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView result;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_weight);
        et2 = (EditText) findViewById(R.id.et_height);
        result = (TextView) findViewById(R.id.tv_result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmi();
            }
        });

    }


    public void bmi() {
        float a, b, c;
        a = Float.parseFloat(et2.getText().toString()) / 100;
        b = Float.parseFloat(et1.getText().toString());
        c = b / (a * a);
        result.setText("" + c);

        if(c<=18.8){
            Toast.makeText(getApplicationContext(),"You are Underweight",Toast.LENGTH_SHORT).show();
        }
        else if((c>=18.9) && (c<25)){
            Toast.makeText(getApplicationContext(),"You are Normal",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"You are Overweight",Toast.LENGTH_SHORT).show();
        }




    }


}
