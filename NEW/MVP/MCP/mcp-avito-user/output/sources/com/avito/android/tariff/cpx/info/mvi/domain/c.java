package com.avito.android.tariff.cpx.info.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTariffCpxInfoUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RB0.a> f296702a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f296703b;

    public c(Provider<RB0.a> provider, Provider<R0> provider2) {
        this.f296702a = provider;
        this.f296703b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f296702a.get(), this.f296703b.get());
    }
}
