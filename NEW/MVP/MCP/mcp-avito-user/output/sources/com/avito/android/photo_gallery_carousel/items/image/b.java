package com.avito.android.photo_gallery_carousel.items.image;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigAdaptiveGalleryImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f217950a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f217951b;

    public b(j jVar, Provider provider) {
        this.f217950a = jVar;
        this.f217951b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((i) this.f217950a.get(), this.f217951b.get());
    }
}
