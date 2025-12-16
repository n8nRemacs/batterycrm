package com.avito.android.photo_gallery_carousel.items.image;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigGalleryImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final j f217957a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f217958b;

    public e(j jVar, Provider provider) {
        this.f217957a = jVar;
        this.f217958b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((i) this.f217957a.get(), this.f217958b.get());
    }
}
