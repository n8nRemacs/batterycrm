package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.my.tracker.obfuscated.e2;

/* loaded from: classes7.dex */
public class CampaignReceiver extends BroadcastReceiver {
    public static void a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString(Constants.REFERRER);
        if (TextUtils.isEmpty(string)) {
            e2.a("CampaignReceiver: referrer is null or empty");
            return;
        }
        e2.a("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, (Class<?>) CampaignService.class).putExtra(Constants.REFERRER, string));
        } catch (Throwable th2) {
            e2.b("CampaignReceiver error: " + th2.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
