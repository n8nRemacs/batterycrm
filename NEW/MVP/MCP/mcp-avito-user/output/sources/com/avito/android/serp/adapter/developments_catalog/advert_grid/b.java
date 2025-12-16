package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertItemBrandspaceGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f269810a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f269811b;

    public b(Provider<i> provider, Provider<com.avito.android.connection_quality.connectivity.a> provider2) {
        this.f269810a = provider;
        this.f269811b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f269810a.get(), this.f269811b.get());
    }
}
