package com.example.shot1.dentaku;

import android.util.Log;

/**
 * Created by shot1 on 2017/07/21.
 */

public class Calc {

    public int Interpretation(String str){

        int answer = 0;
        int kari = 0;
        int len = str.length();
        int i=0;

        answer=readInt(str,i);

        Log.d("ok","1");

        for(;;){

            String A = str.substring(i);

            if (A.equals("+")){
                answer+=readInt(str,i+1);
            }

            if (A.equals("-")){
                answer-=readInt(str,i+1);
            }

            if (A.equals("*")){
                answer*=readInt(str,i+1);
            }

            if (A.equals("=")){
                break;
            }

            i++;
        }



        return answer;

    }

    public int readInt(String str,int i){

        int kari=0;

        for(;;) {
            if (!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("="))) {
                kari=kari*10+Integer.valueOf(str.substring(i));
            }else{
                break;
            }
        }

        return kari;
    }

}
