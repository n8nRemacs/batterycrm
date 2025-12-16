package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCarouselPhotoGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f85039a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X70.b> f85040b;

    public b(Provider<c> provider, Provider<X70.b> provider2) {
        this.f85039a = provider;
        this.f85040b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f85039a.get(), this.f85040b.get());
    }
}
