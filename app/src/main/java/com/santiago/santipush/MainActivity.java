package com.santiago.santipush;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mInit;
    private Button mSetting;
    private Button mStopPush;
    private Button mResumePush;
    private Button mGetRid;
    private TextView mRegId;
    private EditText msgText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){

        mInit = (Button) findViewById(R.id.init);
        mSetting = (Button) findViewById(R.id.setting);
        mStopPush = (Button) findViewById(R.id.stopPush);
        mResumePush = (Button) findViewById(R.id.resumePush);
        mGetRid = (Button) findViewById(R.id.getRegistrationId);
        mRegId = (TextView) findViewById(R.id.tv_regId);
        msgText = (EditText) findViewById(R.id.msg_rec);

        // 监听
        mGetRid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.getRegistrationId:
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);
                break;
        }
    }
}
