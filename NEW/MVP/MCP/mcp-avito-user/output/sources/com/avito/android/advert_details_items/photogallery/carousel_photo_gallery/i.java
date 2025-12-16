package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.advert_core.advert.l;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCarouselPhotoGalleryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f85056a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f85057b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<l> f85058c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f85059d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f85060e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f85061f;

    public i(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f85056a = fVar;
        this.f85057b = fVar2;
        this.f85058c = provider;
        this.f85059d = provider2;
        this.f85060e = provider3;
        this.f85061f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.advert_details_items.photogallery.c) this.f85056a.get(), (R70.b) this.f85057b.get(), this.f85058c.get(), this.f85059d.get(), this.f85060e.get(), this.f85061f.get());
    }
}
