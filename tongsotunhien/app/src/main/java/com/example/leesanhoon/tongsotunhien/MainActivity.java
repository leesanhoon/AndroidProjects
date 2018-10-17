package com.example.leesanhoon.tongsotunhien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //khai bao bien
    EditText editText;
    Button btnResult;
    TextView txtvTong,txtvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ánh xạ
        editText=(EditText)findViewById(R.id.editText);
        btnResult=(Button)findViewById(R.id.button);
        txtvTong=(TextView)findViewById(R.id.textView2);
        txtvKetqua=(TextView)findViewById(R.id.textView3);

        //Click
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(editText.getText().toString());
                int tong=0;
                String chuoi="";
                for (int i=0;i<=n;i++){
                    tong+=i;
                    chuoi+=String.valueOf(i);
                    chuoi+=(i!=n)?"+":"";
                }
                txtvTong.setText("Tổng: "+chuoi);
                txtvKetqua.setText("Kết quả: "+tong);
            }
        });
    }
}
