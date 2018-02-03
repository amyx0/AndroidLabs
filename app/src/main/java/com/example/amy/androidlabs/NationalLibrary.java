package com.example.amy.androidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NationalLibrary extends Activity {
    TextView email_txt;
    Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_library);
        email_txt = (TextView) findViewById(R.id.text_email);
    }
}
