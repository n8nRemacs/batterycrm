package com.avito.android.advert.item.fmp.products;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpProductsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f75595a;

    public b(Provider<c> provider) {
        this.f75595a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f75595a.get());
    }
}
