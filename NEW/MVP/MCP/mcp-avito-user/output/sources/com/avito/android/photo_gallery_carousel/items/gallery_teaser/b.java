package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryTeaserItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f217922a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f217923b;

    public b(e eVar, Provider provider) {
        this.f217922a = eVar;
        this.f217923b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f217922a.get(), this.f217923b.get());
    }
}
