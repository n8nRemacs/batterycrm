package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentItemBrandspaceGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f269816a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f269817b;

    public e(Provider<i> provider, Provider<com.avito.android.connection_quality.connectivity.a> provider2) {
        this.f269816a = provider;
        this.f269817b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f269816a.get(), this.f269817b.get());
    }
}
