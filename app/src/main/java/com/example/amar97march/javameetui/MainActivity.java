package com.example.amar97march.javameetui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // An int variable to hold a value
    private int value = 0;
    // A bunch of Buttons and a TextView
    private Button btnAdd;
    private Button btnTake;
    private TextView txtValue;
    private TextView txtGame;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;
    private Button btnCheck;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnTake=(Button) findViewById(R.id.btnTake);
        btnGrow=(Button) findViewById(R.id.btnGrow);
        btnShrink=(Button) findViewById(R.id.btnShrink);
        btnReset=(Button) findViewById(R.id.btnReset);
        btnHide=(Button) findViewById(R.id.btnHide);
        txtValue=(TextView)findViewById(R.id.txtValue);
        txtGame=(TextView)findViewById(R.id.txtGame);
        btnCheck=(Button) findViewById(R.id.btnCheck);
        txtResult=(TextView)findViewById(R.id.txtResult);
        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        txtValue.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        txtGame.setOnClickListener(this);
        btnCheck.setOnClickListener(this);
        txtResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    float size;
        switch(v.getId()) {
            case R.id.btnAdd: {
                value++;
                if(value==10){value=0;}
                txtValue.setText("" + value);
                txtValue.setVisibility(View.INVISIBLE);
                btnHide.setText("SHOW");
                break;
            }
            case R.id.btnTake:{
                value--;
                if(value==-1){value=9;}
                txtValue.setText(""+value);
                txtValue.setVisibility(View.INVISIBLE);
                btnHide.setText("SHOW");
                break;
            }
            case R.id.btnReset:{
                value=0;
                txtValue.setText(""+value);
                txtValue.setVisibility(View.VISIBLE);
                break;
            }
            case R.id.btnGrow:{
                size=txtGame.getTextScaleX();
                txtGame.setTextScaleX(size+1);
                if(txtGame.getTextScaleX()>5) {
                    txtGame.setTextScaleX(5);
                }
                break;
            }
            case R.id.btnShrink:{
                size=txtGame.getTextScaleX();
                txtGame.setTextScaleX(size-1);
                if(txtGame.getTextScaleX()<1) {
                    txtGame.setTextScaleX(1);
                }
                break;
            }
            case R.id.btnHide:{
                if(txtValue.getVisibility()==View.INVISIBLE){
                    txtValue.setVisibility(View.VISIBLE);
                    btnHide.setText("HIDE");
                }
                else{
                    txtValue.setVisibility(View.INVISIBLE);
                    btnHide.setText("SHOW");
                }
                break;
            }
            case R.id.btnCheck:{
                if(value==7){
                    txtResult.setText("YOU WON");
                }else txtResult.setText("YOU LOOSE");
            }
        }
    }
}


