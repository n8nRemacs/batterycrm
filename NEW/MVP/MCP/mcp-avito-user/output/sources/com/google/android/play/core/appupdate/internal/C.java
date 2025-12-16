package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class C implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f358016b;

    public /* synthetic */ C(D d12, B b12) {
        this.f358016b = d12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        D d12 = this.f358016b;
        d12.f358019b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        d12.a().post(new z(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        D d12 = this.f358016b;
        d12.f358019b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        d12.a().post(new A(this));
    }
}
