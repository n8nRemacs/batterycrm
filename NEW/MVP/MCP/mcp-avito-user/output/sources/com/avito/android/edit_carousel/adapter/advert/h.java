package com.avito.android.edit_carousel.adapter.advert;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditCarouselAdvertItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146255a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.edit_carousel.k> f146256b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f146255a = lVar;
        this.f146256b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f146255a.f393949a, this.f146256b.get());
    }
}
