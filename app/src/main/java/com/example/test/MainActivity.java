package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txt2, txt1;
    private Button btn_CE;
    private Button btn_C;
    private Button btn_DEL;
    private Button btn_Devide;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_Multiply;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_Sub;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_Add;
    private Button btn_Negative;
    private Button btn_0;
    private Button btn_Dot;
    private Button btn_Result;
    String toantu ;
    String toanhang="";
    Double soa, sob,Result=0d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }
    @SuppressLint("WrongViewCast")
    public void initWidget(){
        txt1=findViewById(R.id.text1);
        txt2=findViewById(R.id.text2);
        btn_CE=(Button)findViewById(R.id.btn_CE);
        btn_C=(Button)findViewById(R.id.btn_C);
        btn_DEL=(Button)findViewById(R.id.btn_DEL);
        btn_Devide=(Button)findViewById(R.id.btn_Devide);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_Multiply=(Button)findViewById(R.id.btn_Mutiply);
        btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_Sub=(Button)findViewById(R.id.btn_Sub);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_Add=(Button)findViewById(R.id.btn_Add);
        btn_Negative=(Button)findViewById(R.id.btn_Negative);
        btn_0=(Button)findViewById(R.id.btn_0);
        btn_Dot=(Button)findViewById(R.id.btn_Dot);
        btn_Result=(Button)findViewById(R.id.btn_Result);

    }

    public void setEventClickViews(){
        btn_CE.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_DEL.setOnClickListener(this);
        btn_Devide.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Multiply.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_Sub.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_Add.setOnClickListener(this);
        btn_Negative.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_Dot.setOnClickListener(this);
        btn_Result.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_CE:

                break;
            case R.id.btn_C:
                txt2.setText("");
                break;
            case R.id.btn_DEL:
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(txt2, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));

                break;
            case R.id.btn_Devide:
                soa=Double.parseDouble(txt2.getText().toString());
                toantu="/";
                Result=0d;
                txt1.setText(txt2.getText().toString());
                txt2.setText("/");
                toanhang="";
                break;
            case R.id.btn_7:
                txt2.append("7");
                break;
            case R.id.btn_8:
                txt2.append("8");
                break;
            case R.id.btn_9:
                txt2.append("9");
                break;
            case R.id.btn_Mutiply:
                soa=Double.parseDouble(txt2.getText().toString());
                toantu="x";
                Result=0d;
                txt1.setText(txt2.getText().toString());
                txt2.setText("x");
                toanhang="";
                break;
            case R.id.btn_4:
                txt2.append("4");
                break;
            case R.id.btn_5:
                txt2.append("5");
                break;
            case R.id.btn_6:
                txt2.append("6");
                break;
            case R.id.btn_Sub:
                soa=Double.parseDouble(txt2.getText().toString());
                toantu="-";
                Result=0d;
                txt1.setText(txt2.getText().toString());
                txt2.setText("-");
                toanhang="";
                break;
            case R.id.btn_1:
                txt2.append("1");
                break;
            case R.id.btn_2:
                txt2.append("2");
                break;
            case R.id.btn_3:
                txt2.append("3");
                break;
            case R.id.btn_Add:
                soa=Double.parseDouble(txt2.getText().toString());
                toantu="+";
                Result=0d;
                txt1.setText(txt2.getText().toString());
                txt2.setText("+");
                toanhang="";
                break;
            case R.id.btn_Negative:

                break;
            case R.id.btn_0:
                txt2.append("0");
                break;
            case R.id.btn_Dot:
                txt2.append(".");


                break;
            case R.id.btn_Result:
                sob=Double.parseDouble(txt2.getText().toString());
                if(toantu=="+"){
                    Result=soa+sob;
                }
                else if(toantu=="-"){
                    Result=soa-sob;
                }
                else if(toantu=="x"){
                    Result=soa*sob;
                }
                else if(toantu=="/"){
                    Result=soa/sob;
                }
                txt2.setText(String.valueOf(Result));
                break;
            default:
                char [] so=txt2.getText().toString().toCharArray();
                if(so.length>18){
                    return;
                }
                if(Result!=0){
                    toanhang="";
                    toanhang+=((Button) v).getText().toString();
                    txt2.setText(txt2.getText().toString()+toanhang);
                }
                else {
                    toanhang +=((Button) v).getText().toString();
                    txt2.setText(toanhang);
                }
                break;
        }
    }


}
