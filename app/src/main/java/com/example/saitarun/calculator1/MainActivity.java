package com.example.saitarun.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int i,j,k;
    String op,sl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView2);
    }

    public void Bt1(View v){

        textView.setText(textView.getText().toString()+"1");

    }
    public void Bt2(View v){

        textView.setText(textView.getText().toString()+"2");
    }
    public void Bt3(View v)
    {
        textView.setText(textView.getText().toString()+"3");
    }
    public void Bt4(View v){

        textView.setText(textView.getText().toString()+"4");
    }
    public void Bt5(View v){

        textView.setText(textView.getText().toString()+"5");
    }
    public void Bt6(View v)
    {
        textView.setText(textView.getText().toString()+"6");
    }
    public void Bt7(View v){

        textView.setText(textView.getText().toString()+"7");
    }
    public void Bt8(View v)
    {
        textView.setText(textView.getText().toString()+"8");
    }
    public void Bt9(View v)
    {
        textView.setText(textView.getText().toString()+"9");
    }
    public void Bt0(View v){

        textView.setText(textView.getText().toString()+"0");
    }
    public void Btequal(View v){
        if(op=="+"){
            j=Integer.parseInt(textView.getText().toString());
            textView.setText(String.valueOf(i+j));
        }
        else if(op=="-"){
            j=Integer.parseInt(textView.getText().toString());
            textView.setText(String.valueOf(i-j));
        }
        else if(op=="*"){
            j=Integer.parseInt(textView.getText().toString());
            textView.setText(String.valueOf(i*j));
        }
        else{
            j=Integer.parseInt(textView.getText().toString());
            textView.setText(String.valueOf(i/j));
        }

    }
    public void Btadd(View v){
        i=Integer.parseInt(textView.getText().toString());
        textView.setText("");
        op="+";
    }
    public void Btsub(View v){
        i=Integer.parseInt(textView.getText().toString());
        textView.setText("");
        op="-";
    }
    public void Btmul(View v){
        i=Integer.parseInt(textView.getText().toString());
        textView.setText("");
        op="*";
    }
    public void Btdiv(View v){
        i=Integer.parseInt(textView.getText().toString());
        textView.setText("");
        op="/";
    }
    public void BtDel(View v){
     sl=textView.getText().toString();
     k=sl.length();
        if(k>0){
            k=k-1;
            textView.setText(sl.length()-1);
        }
    }

}

