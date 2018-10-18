package com.example.leesanhoon.bangcuuchuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //khai báo biến
    EditText edtN;
    Button btnResult;
    TextView txtv1,txtv2,txtv3,
            txtv4,txtv5,txtv6,txtv7,txtv8,txtv9,txtv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ánh xạ
        edtN=(EditText)findViewById(R.id.editText);
        btnResult=(Button)findViewById(R.id.button);
        txtv1=(TextView)findViewById(R.id.textView2);
        txtv2=(TextView)findViewById(R.id.textView4);
        txtv3=(TextView)findViewById(R.id.textView5);
        txtv4=(TextView)findViewById(R.id.textView6);
        txtv5=(TextView)findViewById(R.id.textView7);
        txtv6=(TextView)findViewById(R.id.textView8);
        txtv7=(TextView)findViewById(R.id.textView9);
        txtv8=(TextView)findViewById(R.id.textView10);
        txtv9=(TextView)findViewById(R.id.textView11);
        txtv10=(TextView)findViewById(R.id.textView12);

        // click
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(edtN.getText().toString());
                int m[] = new int[11];
                for ( int i=1;i<=10;i++){
                    m[i]=n*i;
                }
                    txtv1.setText(+n+" X 1 ="+m[1]);
                    txtv2.setText(+n+" X 2 ="+m[2]);
                    txtv3.setText(+n+" X 3 ="+m[3]);
                    txtv4.setText(+n+" X 4 ="+m[4]);
                    txtv5.setText(+n+" X 5 ="+m[5]);
                    txtv6.setText(+n+" X 6 ="+m[6]);
                    txtv7.setText(+n+" X 7 ="+m[7]);
                    txtv8.setText(+n+" X 8 ="+m[8]);
                    txtv9.setText(+n+" X 9 ="+m[9]);
                    txtv10.setText(+n+" X 10 ="+m[10]);











            }
        });
    }
}
