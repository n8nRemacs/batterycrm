package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f358790a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f358791b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f358792c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f358793d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public p0 f358794e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f358795f = false;

    public q0(s0 s0Var, IntentFilter intentFilter, Context context) {
        this.f358790a = s0Var;
        this.f358791b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f358792c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        p0 p0Var;
        if ((this.f358795f || !this.f358793d.isEmpty()) && this.f358794e == null) {
            p0 p0Var2 = new p0(this, null);
            this.f358794e = p0Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f358792c.registerReceiver(p0Var2, this.f358791b, 2);
            }
            this.f358792c.registerReceiver(this.f358794e, this.f358791b);
        }
        if (this.f358795f || !this.f358793d.isEmpty() || (p0Var = this.f358794e) == null) {
            return;
        }
        this.f358792c.unregisterReceiver(p0Var);
        this.f358794e = null;
    }
}
