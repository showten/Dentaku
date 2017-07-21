package com.example.shot1.dentaku;

import android.util.Log;

/**
 * Created by shot1 on 2017/07/21.
 */

public class Calc {

    int flag=0;

    public int Interpretation(String str){

        int answer = 0;
        int kari = 0;
        int len = str.length();
        int i=0;

        flag=0;

        answer=readInt(str,i);

        Log.d("ok","1");

        for(;;){

            String A = str.substring(i,i+1);

            if (A.equals("+")){
                answer+=readInt(str,i+1);
            }

            if (A.equals("-")){
                answer-=readInt(str,i+1);
            }

            if (A.equals("*")){
                answer*=readInt(str,i+1);
            }

            if (A.equals("/")){

                if(answer%readInt(str,i+1)!=0){
                    flag=1;
                }
                answer=answer/readInt(str,i+1);
            }

            if (A.equals("=")){
                break;
            }

            i++;
        }

//

        return answer;

    }

    public int checkWaru(){
        return flag;
    }

    public int readInt(String str,int i){

        int kari=0;

        for(;;) {
            if (!(str.substring(i,i+1).equals("+") ||str.substring(i,i+1).equals("/") || str.substring(i,i+1).equals("-") || str.substring(i,i+1).equals("*") || str.substring(i,i+1).equals("="))) {
                kari=kari*10+Integer.valueOf(str.substring(i,i+1));
            }else{
                break;
            }
            i++;
        }

        return kari;
    }

}
