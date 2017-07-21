package com.example.shot1.dentaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private String Shiki="";
    private String ShikiOperator="";


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
                Shiki += "0";
                textView.setText(Shiki);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "1";
                textView.setText(Shiki);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "2";
                textView.setText(Shiki);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "3";
                textView.setText(Shiki);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "4";
                textView.setText(Shiki);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "5";
                textView.setText(Shiki);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "6";
                textView.setText(Shiki);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "7";
                textView.setText(Shiki);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "8";
                textView.setText(Shiki);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki += "9";
                textView.setText(Shiki);
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShikiOperator= "+";
                shikiCheck();
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShikiOperator= "-";
                shikiCheck();
            }
        });
        buttonKakeru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShikiOperator= "*";
                shikiCheck();
            }
        });
        //buttonWaru.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //    public void onClick(View v) {
        //        Shiki += "";
        //    }
        //});

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShikiOperator = "=";
                shikiCheck();
                if (Shiki.length()>0) {
                    //Log.d("Shiki",Shiki);
                    //計算する
                    Calc ca = new Calc();
                    int a = ca.Interpretation(Shiki);
                    int flag=ca.checkWaru();
                    if (flag==1)
                        textView.setText("およそ"+String.valueOf(a));
                    else
                        textView.setText(String.valueOf(a));
                    Shiki = String.valueOf(a);
                }
            }
        });

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shiki="";
                textView.setText(Shiki);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //main.xmlの内容を読み込む
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                ShikiOperator= "/";
                shikiCheck();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    private void shikiCheck(){
        if (Shiki.length()>0){
            char c = Shiki.charAt(Shiki.length()-1);
            if(c == '+' | c == '-' | c=='*' | c== '=')
                Toast.makeText(this, "演算子は重複できません", Toast.LENGTH_SHORT).show();
            else
                Shiki+=ShikiOperator;

            textView.setText(Shiki);
            }
        }


    }

