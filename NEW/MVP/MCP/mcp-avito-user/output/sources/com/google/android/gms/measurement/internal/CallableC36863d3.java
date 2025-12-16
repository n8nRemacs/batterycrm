package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC36863d3 implements Callable<List<K5>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f355099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f355100c;

    public CallableC36863d3(M2 m22, String str) {
        this.f355099b = str;
        this.f355100c = m22;
    }

    @Override // java.util.concurrent.Callable
    public final List<K5> call() throws IOException {
        M2 m22 = this.f355100c;
        m22.f354801a.Q();
        C36908k c36908k = m22.f354801a.f355440c;
        C36997w5.n(c36908k);
        return c36908k.W(this.f355099b);
    }
}
