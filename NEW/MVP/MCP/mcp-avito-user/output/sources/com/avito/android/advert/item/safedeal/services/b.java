package com.avito.android.advert.item.safedeal.services;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealServicesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f79016b;

    public b(u uVar, Provider provider) {
        this.f79015a = uVar;
        this.f79016b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79015a.get(), this.f79016b.get());
    }
}
