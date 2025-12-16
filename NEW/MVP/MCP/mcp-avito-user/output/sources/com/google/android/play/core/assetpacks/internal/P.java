package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class P implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f358357b;

    public /* synthetic */ P(Q q12, O o12) {
        this.f358357b = q12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Q q12 = this.f358357b;
        q12.f358360b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        q12.a().post(new M(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Q q12 = this.f358357b;
        q12.f358360b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        q12.a().post(new N(this));
    }
}
