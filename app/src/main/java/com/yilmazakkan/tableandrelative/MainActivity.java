package com.yilmazakkan.tableandrelative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        bt1=findViewById( R.id.btn1 );
        bt2=findViewById( R.id.btn2 );
        bt3=findViewById( R.id.btn3 );
        bt4=findViewById( R.id.btn4 );
        txt1=findViewById( R.id.et1 );


    }
    public void btnClick (View view)
    {
        switch (view.getId()) {
            case R.id.btn1:
                bt1.setText( txt1.getText().toString() );
                break;

            case R.id.btn2:
                bt2.setText( bt1.getText().toString() );
                break;

            case R.id.btn3:
                bt2.setText("Yılmaz Akkan");
                break;
            case R.id.btn4:
                Toast.makeText( getApplicationContext(),"  Ödev Tamamlandı.\n"+ "Mission Complate !!!",Toast.LENGTH_LONG ).show();
                break;

        }
    }
}
