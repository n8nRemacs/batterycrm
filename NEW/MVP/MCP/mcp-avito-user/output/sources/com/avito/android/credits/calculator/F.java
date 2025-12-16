package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: SberCreditCalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128653a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128654b;

    public F(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2) {
        this.f128653a = provider;
        this.f128654b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f128653a.get(), this.f128654b.get());
    }
}
