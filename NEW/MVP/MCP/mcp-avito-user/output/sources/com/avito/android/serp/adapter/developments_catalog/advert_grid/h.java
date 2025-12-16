package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentItemGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f269825a;

    /* renamed from: b, reason: collision with root package name */
    public final u f269826b;

    public h(u uVar, Provider provider) {
        this.f269825a = provider;
        this.f269826b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f269825a.get(), (com.avito.android.connection_quality.connectivity.a) this.f269826b.get());
    }
}
