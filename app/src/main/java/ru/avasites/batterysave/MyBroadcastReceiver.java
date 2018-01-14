package ru.avasites.batterysave;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by zheev on 11.01.18.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver(){}

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Toast toast = Toast.makeText(context.getApplicationContext(),
                    "Робит", Toast.LENGTH_LONG);
            toast.show();
            Log.d("myapp", "Робит");

            Intent intents = new Intent(context.getApplicationContext(), MainActivity.class);
            context.startActivity(intents);
        }
    }
}
