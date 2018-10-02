package com.annimon.secretcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SecretCodeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(
                SecretActivity.newIntent(context)
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        );
    }

}