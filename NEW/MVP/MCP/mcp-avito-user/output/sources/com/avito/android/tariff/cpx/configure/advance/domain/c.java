package com.avito.android.tariff.cpx.configure.advance.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceSaveUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f295636a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f295637b;

    public c(Provider<WB0.a> provider, Provider<R0> provider2) {
        this.f295636a = provider;
        this.f295637b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f295636a.get(), this.f295637b.get());
    }
}
