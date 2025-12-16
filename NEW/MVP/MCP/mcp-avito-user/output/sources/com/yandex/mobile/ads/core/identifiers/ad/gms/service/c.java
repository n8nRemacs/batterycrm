package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j.N;
import j.P;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final LinkedBlockingQueue f382691a = new LinkedBlockingQueue();

    @P
    public final IBinder a() {
        return (IBinder) this.f382691a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@N ComponentName componentName, @N IBinder iBinder) throws InterruptedException {
        try {
            this.f382691a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@N ComponentName componentName) {
        try {
            this.f382691a.clear();
        } catch (UnsupportedOperationException unused) {
        }
    }
}
