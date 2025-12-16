package com.avito.android.credits.calculator;

import javax.inject.Provider;

/* compiled from: InstallmentsCalculatorBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.credits.q> f128725a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.credits.x> f128726b;

    public w(Provider<com.avito.android.credits.q> provider, Provider<com.avito.android.credits.x> provider2) {
        this.f128725a = provider;
        this.f128726b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v(this.f128725a.get(), this.f128726b.get());
    }
}
