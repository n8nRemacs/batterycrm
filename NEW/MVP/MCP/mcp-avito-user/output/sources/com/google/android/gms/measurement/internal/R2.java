package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class R2 implements Callable<List<K5>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M2 f354874e;

    public R2(M2 m22, String str, String str2, String str3) {
        this.f354871b = str;
        this.f354872c = str2;
        this.f354873d = str3;
        this.f354874e = m22;
    }

    @Override // java.util.concurrent.Callable
    public final List<K5> call() throws IOException {
        M2 m22 = this.f354874e;
        m22.f354801a.Q();
        C36908k c36908k = m22.f354801a.f355440c;
        C36997w5.n(c36908k);
        return c36908k.N(this.f354871b, this.f354872c, this.f354873d);
    }
}
