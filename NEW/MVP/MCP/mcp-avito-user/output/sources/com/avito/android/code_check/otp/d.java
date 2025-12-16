package com.avito.android.code_check.otp;

import android.content.Context;
import com.avito.android.util.R0;
import com.google.android.gms.auth.api.phone.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SmsOtpHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f118856a;

    /* renamed from: b, reason: collision with root package name */
    public final l f118857b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f118858c;

    /* renamed from: d, reason: collision with root package name */
    public final l f118859d;

    public d(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f118856a = provider;
        this.f118857b = lVar;
        this.f118858c = provider2;
        this.f118859d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f118856a.get(), (Context) this.f118857b.f393949a, this.f118858c.get(), (androidx.view.result.b) this.f118859d.f393949a);
    }
}
