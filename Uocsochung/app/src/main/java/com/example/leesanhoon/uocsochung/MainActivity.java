package com.example.leesanhoon.uocsochung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //khai báo biến
    EditText edta,edtb;
    Button btnTinh;
    TextView txtvUCLN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ánh xạ
        edta=(EditText)findViewById(R.id.editText);
        edtb=(EditText)findViewById(R.id.editText2);
        btnTinh=(Button)findViewById(R.id.button);
        txtvUCLN=(TextView)findViewById(R.id.textView4);

        //Click
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());
                txtvUCLN.setText("UCLN là :"+UCLN(a,b)+ " và Ước chung :"+UC(a,b)+"BCNN là :"+BCNN(a,b));
            }
        });
    }
    public int UCLN(int a,int b) {
        while (a!=b){
            if(a<b){
                b=b-a;
            }else
                a=a-b;
        }
        return a;
    }
    public String UC(int a,int b){
        String uc="";
        if(a<b){
            for(int i=1;i<=a;i++){
                if(a%i==0&&b%i==0){
                    uc+=i+" ";
                }
            }
        }else
            for(int i=1;i<=b;i++){
                if (a%i==0&&b%i==0){
                    uc+=i+" ";
                }
            }
            return uc;
    }
    public int BCNN(int a,int b){
        int bcnn;
        bcnn=a*b/UCLN(a,b);
        return bcnn;
    }
}
