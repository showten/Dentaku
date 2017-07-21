package com.example.shot1.dentaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private String Shiki="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //


        // TextView の設定
        textView = (TextView) findViewById(R.id.text_view);


        //数字ボタン

        // ボタンを設定
        //Number
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        //Button button = (Button)findViewById(R.id.button);

        //Operator
        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        Button buttonKakeru = (Button)findViewById(R.id.buttonKakeru);
        //Button buttonWaru = (Button)findViewById(R.id.buttonWaru);
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);

        //Others
        //Button buttonDel = (Button)findViewById(R.id.buttonDel);
        Button buttonAc = (Button)findViewById(R.id.buttonAc);

        //
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki+="0";
            }
        }



    }


}
