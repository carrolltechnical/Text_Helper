package com.example.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(message);
//    }
//}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
    public void sendMessage(View view) {
        // Get the Intent that started this activity and extract the string
        //Intent intent = getIntent();
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.smsNumber);
        textView.setText(message);
        String textThis = String.valueOf(R.id.smsNumber);
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(textThis, null, "test sms message", null, null);
    }
}