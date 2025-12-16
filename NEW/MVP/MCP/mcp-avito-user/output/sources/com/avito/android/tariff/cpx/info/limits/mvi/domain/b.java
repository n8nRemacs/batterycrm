package com.avito.android.tariff.cpx.info.limits.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SfTariffLimitsGetUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RB0.a> f296607a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f296608b;

    public b(Provider<RB0.a> provider, Provider<R0> provider2) {
        this.f296607a = provider;
        this.f296608b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f296607a.get(), this.f296608b.get());
    }
}
