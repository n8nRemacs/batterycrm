package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: InstallmentsV2CalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128732a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128733b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f128734c;

    public y(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2, Provider<com.avito.android.util.text.a> provider3) {
        this.f128732a = provider;
        this.f128733b = provider2;
        this.f128734c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f128732a.get(), this.f128733b.get(), this.f128734c.get());
    }
}
