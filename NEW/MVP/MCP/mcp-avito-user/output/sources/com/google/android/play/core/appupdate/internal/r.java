package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import j.P;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final s f358040a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f358041b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f358042c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f358043d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @P
    public q f358044e = null;

    public r(s sVar, IntentFilter intentFilter, Context context) {
        this.f358040a = sVar;
        this.f358041b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f358042c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(com.google.android.play.core.install.a aVar) {
        this.f358040a.c("registerListener", new Object[0]);
        if (aVar == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.f358043d.add(aVar);
        d();
    }

    public final synchronized void c(com.google.android.play.core.install.a aVar) {
        this.f358040a.c("unregisterListener", new Object[0]);
        if (aVar == null) {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
        this.f358043d.remove(aVar);
        d();
    }

    public final void d() {
        q qVar;
        HashSet hashSet = this.f358043d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f358042c;
        if (!zIsEmpty && this.f358044e == null) {
            q qVar2 = new q(this, null);
            this.f358044e = qVar2;
            int i12 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f358041b;
            if (i12 >= 33) {
                context.registerReceiver(qVar2, intentFilter, 2);
            } else {
                context.registerReceiver(qVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (qVar = this.f358044e) == null) {
            return;
        }
        context.unregisterReceiver(qVar);
        this.f358044e = null;
    }
}
