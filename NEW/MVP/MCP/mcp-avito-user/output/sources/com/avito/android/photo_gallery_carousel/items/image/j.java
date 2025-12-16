package com.avito.android.photo_gallery_carousel.items.image;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryImageItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f217965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f217966b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f217965a = lVar;
        this.f217966b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f217965a.f393949a, this.f217966b.get());
    }
}
