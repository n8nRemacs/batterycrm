package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.avito.konveyor.item_visibility_tracker.c;
import com.my.tracker.obfuscated.C37835i;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.e2;
import n11.RunnableC44167a;

/* loaded from: classes7.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        e2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i12, int i13) {
        RunnableC44167a runnableC44167a = new RunnableC44167a(this, 0);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(Constants.REFERRER);
            if (!TextUtils.isEmpty(stringExtra)) {
                C37835i.a(new c(this, stringExtra, runnableC44167a, 13));
                return super.onStartCommand(null, i12, i13);
            }
        }
        C37835i.a(runnableC44167a);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        e0.a(str, this, runnable);
    }
}
