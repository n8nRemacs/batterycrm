package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public I f358089b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f358089b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC37122g interfaceC37122g;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (L0.class) {
            try {
                if (L0.f358174a == null) {
                    new C37164o0(null);
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 != null) {
                        applicationContext = applicationContext2;
                    }
                    L0.f358174a = new C37158m0(new R1(applicationContext), null);
                }
                interfaceC37122g = L0.f358174a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f358089b = (I) ((C37158m0) interfaceC37122g).f358433y.a();
    }
}
