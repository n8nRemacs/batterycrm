package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.measurement.internal.InterfaceC36858c5;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class Y4<T extends Context & InterfaceC36858c5> {

    /* renamed from: a, reason: collision with root package name */
    public final Service f354996a;

    public Y4(Service service) {
        this.f354996a = service;
    }

    public final void a(Runnable runnable) {
        C36997w5 c36997w5C = C36997w5.c(this.f354996a);
        c36997w5C.zzl().n(new RunnableC36865d5(c36997w5C, runnable));
    }

    public final S1 b() {
        S1 s12 = I2.a(this.f354996a, null, null).f354717i;
        I2.c(s12);
        return s12;
    }
}
