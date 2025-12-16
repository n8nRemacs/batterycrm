package com.avito.android.photo_gallery_carousel.items.image;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SmallGalleryImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final j f217976a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f217977b;

    public n(j jVar, Provider provider) {
        this.f217976a = jVar;
        this.f217977b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((i) this.f217976a.get(), this.f217977b.get());
    }
}
