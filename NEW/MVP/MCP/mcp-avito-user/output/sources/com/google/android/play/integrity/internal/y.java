package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class y implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f358928b;

    public /* synthetic */ y(z zVar, x xVar) {
        this.f358928b = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar = this.f358928b;
        zVar.f358931b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zVar.a().post(new u(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z zVar = this.f358928b;
        zVar.f358931b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zVar.a().post(new v(this));
    }
}
