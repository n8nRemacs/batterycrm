package com.avito.android.item_map.geo_zones;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GeoZonesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f173362a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173363b;

    public k(u uVar, Provider provider) {
        this.f173362a = uVar;
        this.f173363b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a) this.f173362a.get(), this.f173363b.get());
    }
}
