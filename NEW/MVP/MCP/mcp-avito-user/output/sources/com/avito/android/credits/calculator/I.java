package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: TinkoffAutoCreditCalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128660b;

    public I(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2) {
        this.f128659a = provider;
        this.f128660b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f128659a.get(), this.f128660b.get());
    }
}
