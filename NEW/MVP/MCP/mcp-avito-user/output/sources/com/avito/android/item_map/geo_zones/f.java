package com.avito.android.item_map.geo_zones;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sO.InterfaceC48083a;

/* compiled from: GeoZonesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48083a> f173352a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.remote.error.i f173353b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f173354c;

    public f(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f173352a = provider;
        this.f173353b = iVar;
        this.f173354c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f173352a.get(), (com.avito.android.remote.error.f) this.f173353b.get(), this.f173354c.get());
    }
}
