package com.avito.android.advert_details_items.carousel_photogallery;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselPhotoGalleryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.photogallery.c> f84553a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R70.b> f84554b;

    /* renamed from: c, reason: collision with root package name */
    public final u f84555c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f84553a = provider;
        this.f84554b = provider2;
        this.f84555c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f84553a.get(), this.f84554b.get(), (InterfaceC28373a) this.f84555c.get());
    }
}
