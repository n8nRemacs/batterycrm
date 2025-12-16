package com.avito.android.advert.item.interiorPhotos;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InteriorPhotosPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f76603a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f76604b;

    public k(u uVar, Provider provider) {
        this.f76603a = uVar;
        this.f76604b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((B7.a) this.f76603a.get(), this.f76604b.get());
    }
}
