package com.avito.android.photo_gallery.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: LegacyPhotoGalleryModule_ProvideFromPageSource$_avito_photo_gallery_implFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes14.dex */
public final class r implements dagger.internal.h<FromPageSource> {

    /* compiled from: LegacyPhotoGalleryModule_ProvideFromPageSource$_avito_photo_gallery_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f217067a = new r();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l.f217029a.getClass();
        FromPageSource.PhotoGallery photoGallery = FromPageSource.PhotoGallery.f82335c;
        dagger.internal.t.d(photoGallery);
        return photoGallery;
    }
}
