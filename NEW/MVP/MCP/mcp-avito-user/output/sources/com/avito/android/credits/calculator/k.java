package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: CashLoansCreditCalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128687a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128688b;

    public k(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2) {
        this.f128687a = provider;
        this.f128688b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f128687a.get(), this.f128688b.get());
    }
}
