package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.mobile.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import j.N;
import j.P;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final LinkedBlockingQueue f382703a = new LinkedBlockingQueue();

    @P
    public final OpenDeviceIdentifierService a() {
        return (OpenDeviceIdentifierService) this.f382703a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@N ComponentName componentName, @N IBinder iBinder) throws InterruptedException {
        try {
            this.f382703a.put(OpenDeviceIdentifierService.Stub.asInterface(iBinder));
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@N ComponentName componentName) {
        try {
            this.f382703a.clear();
        } catch (UnsupportedOperationException unused) {
        }
    }
}
