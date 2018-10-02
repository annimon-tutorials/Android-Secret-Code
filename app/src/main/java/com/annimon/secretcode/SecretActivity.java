package com.annimon.secretcode;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecretActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        final Intent intent = new Intent(context, SecretActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
    }
}
