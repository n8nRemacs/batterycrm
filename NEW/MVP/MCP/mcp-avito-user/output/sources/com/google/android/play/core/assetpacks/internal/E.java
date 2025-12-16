package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public final F f358339a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f358340b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f358341c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f358342d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public D f358343e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f358344f = false;

    public E(F f12, IntentFilter intentFilter, Context context) {
        this.f358339a = f12;
        this.f358340b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f358341c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        D d12;
        if ((this.f358344f || !this.f358342d.isEmpty()) && this.f358343e == null) {
            D d13 = new D(this, null);
            this.f358343e = d13;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f358341c.registerReceiver(d13, this.f358340b, 2);
            } else {
                this.f358341c.registerReceiver(d13, this.f358340b);
            }
        }
        if (this.f358344f || !this.f358342d.isEmpty() || (d12 = this.f358343e) == null) {
            return;
        }
        this.f358341c.unregisterReceiver(d12);
        this.f358343e = null;
    }

    public abstract void b(Intent intent);
}
