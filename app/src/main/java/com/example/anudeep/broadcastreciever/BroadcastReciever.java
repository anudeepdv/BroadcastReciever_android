package com.example.anudeep.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.widget.Toast;

/**
 * Created by anudeep on 02/07/17.
 */

public class BroadcastReciever extends WakefulBroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"you recieve sms",Toast.LENGTH_LONG).show();

    }
}
