package com.avito.android.photo_gallery_carousel.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselPhotoGalleryViewModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f217749a;

    /* renamed from: b, reason: collision with root package name */
    public final u f217750b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f217751c;

    public g(c cVar, u uVar, Provider provider) {
        this.f217749a = cVar;
        this.f217750b = uVar;
        this.f217751c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f217750b.get();
        com.avito.konveyor.a aVar2 = this.f217751c.get();
        this.f217749a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
