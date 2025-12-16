package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ServiceConnectionC37213f implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37214g f358756b;

    public /* synthetic */ ServiceConnectionC37213f(C37214g c37214g, C37212e c37212e) {
        this.f358756b = c37214g;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C37214g c37214g = this.f358756b;
        c37214g.f358760b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c37214g.a().post(new C37210c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C37214g c37214g = this.f358756b;
        c37214g.f358760b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c37214g.a().post(new C37211d(this));
    }
}
