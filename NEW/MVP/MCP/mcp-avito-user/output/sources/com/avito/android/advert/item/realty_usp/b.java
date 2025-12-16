package com.avito.android.advert.item.realty_usp;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyUspBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f78395a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f78396b;

    public b(Provider<g> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f78395a = provider;
        this.f78396b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f78395a.get(), this.f78396b.get());
    }
}
