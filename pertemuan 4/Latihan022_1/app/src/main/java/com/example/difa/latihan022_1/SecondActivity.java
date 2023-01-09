package com.example.difa.latihan022_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLAY =
            "com.example.difa.latihan022_1.extra.REPLY";
    private EditText mReply;
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mReply = findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message_reply);
        textView.setText(message);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    public void ReturnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyintent = new Intent();
        replyintent.putExtra(EXTRA_REPLAY, reply);
        setResult(RESULT_OK,replyintent);
        Log.d(LOG_TAG,"End SecondActivity");
        finish();
    }
}