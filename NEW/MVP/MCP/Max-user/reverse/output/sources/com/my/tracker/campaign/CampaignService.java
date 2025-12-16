package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.TrackerUtils;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.core.Tracer;
import defpackage.my1;
import defpackage.vy1;

/* loaded from: classes.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Tracer.d("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Tracer.d("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent != null ? intent.getStringExtra("referrer") : null;
        if (TextUtils.isEmpty(stringExtra)) {
            TrackerUtils.runOnAnyBackground(new vy1(9, this));
            return 2;
        }
        TrackerUtils.runOnAnyBackground(new my1(this, 8, stringExtra));
        return super.onStartCommand(null, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        a.a(str, this);
        stopSelf();
    }
}
