package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: HarabaCreditCalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128719b;

    public t(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2) {
        this.f128718a = provider;
        this.f128719b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f128718a.get(), this.f128719b.get());
    }
}
