package com.example.gauravsingh.basiccalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
EditText ed1,ed2;
    TextView tv;
int int1;
    int int2;
    int int3,int4,sq;
    String s,s1,s2,s3,s4,s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 =  (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView2);
        }
        public void add(View v){
            s=ed1.getText().toString();
            s1=ed2.getText().toString();
            if(s.equals("") || s1.equals("")||(s.equals("")&& s1.equals(""))) {
                Toast t= Toast.makeText(this,"Enter Both Values",Toast.LENGTH_SHORT);
                t.show();
    }
            else{
                int1=Integer.parseInt(s);
                int2=Integer.parseInt(s1);
                int3 = int1 + int2;
                s2=int3 + "";
                tv.setText(s2);
            }}
    public void sub(View v){
        s=ed1.getText().toString();
        s1=ed2.getText().toString();
        if(s.equals("") || s1.equals("")||(s.equals("")&& s1.equals(""))) {
            Toast t = Toast.makeText(this, "Enter Both Values", Toast.LENGTH_SHORT);
            t.show();
        }
        else {
        int1=Integer.parseInt(s);
        int2=Integer.parseInt(s1);
        int3 = int1 - int2;
        s2=int3 + "";
        tv.setText(s2);
    }}
    public  void sqr(View v){
        if(tv.getText().equals("")){
            Toast t= Toast.makeText(this,"Perform add|subtract first",Toast.LENGTH_SHORT);
            t.show();
        }
        else {
        int4=Integer.parseInt(tv.getText().toString());
        sq=int4*int4;
        s4=sq + "";
        tv.setText(s4);
        if(tv.getText().equals(s4)){
            Toast t=Toast.makeText(this,"Square of Result is : "+ s4,Toast.LENGTH_SHORT);
            t.show();
            tv.setText(s2);
        };
    }}
    public void reset(View v){
        ed1.setText("");
        ed2.setText("");
        tv.setText("");
        ed1.requestFocus();
        Toast.makeText(this,"Enter New Values",Toast.LENGTH_SHORT).show();
    }
}
