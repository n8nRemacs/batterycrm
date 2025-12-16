package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class S4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f354905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q4 f354906c;

    public S4(Q4 q42, ComponentName componentName) {
        this.f354905b = componentName;
        this.f354906c = q42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4.t(this.f354906c.f354864d, this.f354905b);
    }
}
