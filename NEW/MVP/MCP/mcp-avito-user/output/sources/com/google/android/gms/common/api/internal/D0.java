package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class D0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public Context f348984a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f348985b;

    public D0(C0 c02) {
        this.f348985b = c02;
    }

    public final synchronized void a() {
        try {
            Context context = this.f348984a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f348984a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f348985b.a();
            a();
        }
    }
}
