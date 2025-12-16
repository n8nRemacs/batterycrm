package com.avito.android.tariff.cpx.save.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostTariffCpxSaveUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f297363a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f297364b;

    public c(Provider<WB0.a> provider, Provider<R0> provider2) {
        this.f297363a = provider;
        this.f297364b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f297363a.get(), this.f297364b.get());
    }
}
