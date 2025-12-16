package com.avito.android.advert.item.leasing_calculator;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsLeasingCalculatorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f77362a;

    public b(Provider<c> provider) {
        this.f77362a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77362a.get());
    }
}
