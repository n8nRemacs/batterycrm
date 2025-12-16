package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class W2 implements Callable<List<zzae>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M2 f354969e;

    public W2(M2 m22, String str, String str2, String str3) {
        this.f354966b = str;
        this.f354967c = str2;
        this.f354968d = str3;
        this.f354969e = m22;
    }

    @Override // java.util.concurrent.Callable
    public final List<zzae> call() throws IOException {
        M2 m22 = this.f354969e;
        m22.f354801a.Q();
        C36908k c36908k = m22.f354801a.f355440c;
        C36997w5.n(c36908k);
        return c36908k.v(this.f354966b, this.f354967c, this.f354968d);
    }
}
