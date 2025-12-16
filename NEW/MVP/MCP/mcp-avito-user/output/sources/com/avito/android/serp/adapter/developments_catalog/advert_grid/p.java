package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentItemMainGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f269846a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f269847b;

    public p(Provider<i> provider, Provider<com.avito.android.connection_quality.connectivity.a> provider2) {
        this.f269846a = provider;
        this.f269847b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f269846a.get(), this.f269847b.get());
    }
}
