package com.munira.munira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textView1;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView1 = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);



    }

    public void button3(View view) {
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        int reslt = numb1 * numb2;

        textView1.setText(String.valueOf(reslt));

    }

    public void button2(View view) {
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        int reslt = numb1 - numb2;

        textView1.setText(String.valueOf(reslt));
    }

    public void button4(View view) {
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        int reslt = numb1 /numb2;

        textView1.setText(String.valueOf(reslt));
    }

    public void button5(View view) {
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        int reslt = numb1 %numb2;

        textView1.setText(String.valueOf(reslt));
    }

    public void button6(View view) {
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        double reslt = Math.pow(numb1,numb2);
        textView1.setText(Double.toString(reslt));
    }


    public void button1(View view){
        int numb1=Integer.parseInt(editText1.getText().toString());
        int numb2=Integer.parseInt(editText2.getText().toString());
        int reslt = numb1 + numb2;
        textView1.setText(String.valueOf(reslt));
    }



}