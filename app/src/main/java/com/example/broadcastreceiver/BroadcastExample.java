package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isPlaneMode=intent.getBooleanExtra("state",false);

        if(isPlaneMode==true){
            Toast.makeText(context,"device is airplane mode",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(context,"device is not airplane mode",Toast.LENGTH_LONG).show();
        }

    }
}
