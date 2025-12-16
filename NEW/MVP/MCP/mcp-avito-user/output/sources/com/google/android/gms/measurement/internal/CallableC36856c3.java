package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC36856c3 implements Callable<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M2 f355055b;

    public CallableC36856c3(M2 m22, zzbe zzbeVar, String str) {
        this.f355055b = m22;
    }

    @Override // java.util.concurrent.Callable
    public final byte[] call() throws IOException {
        M2 m22 = this.f355055b;
        m22.f354801a.Q();
        C36927m4 c36927m4 = m22.f354801a.f355445h;
        C36997w5.n(c36927m4);
        c36927m4.e();
        c36927m4.f355183a.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
