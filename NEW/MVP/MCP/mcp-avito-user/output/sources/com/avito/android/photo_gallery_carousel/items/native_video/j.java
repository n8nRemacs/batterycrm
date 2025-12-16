package com.avito.android.photo_gallery_carousel.items.native_video;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryNativeVideoItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f218000a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f218001b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.player.router.d> f218002c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f218000a = lVar;
        this.f218001b = provider;
        this.f218002c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f218000a.f393949a, this.f218001b.get(), this.f218002c.get());
    }
}
