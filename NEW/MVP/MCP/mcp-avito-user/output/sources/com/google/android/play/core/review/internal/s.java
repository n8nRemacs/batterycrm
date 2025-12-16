package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class s implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f358632b;

    public /* synthetic */ s(t tVar, r rVar) {
        this.f358632b = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t tVar = this.f358632b;
        tVar.f358635b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        tVar.a().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        t tVar = this.f358632b;
        tVar.f358635b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        tVar.a().post(new q(this));
    }
}
