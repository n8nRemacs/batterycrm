package com.avito.android.publish.input_vin.mvi.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VinItemsListConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.category_parameters.a> f236711a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.e> f236712b;

    public q(Provider<com.avito.android.category_parameters.a> provider, Provider<com.avito.android.publish.items.e> provider2) {
        this.f236711a = provider;
        this.f236712b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f236711a.get(), this.f236712b.get());
    }
}
