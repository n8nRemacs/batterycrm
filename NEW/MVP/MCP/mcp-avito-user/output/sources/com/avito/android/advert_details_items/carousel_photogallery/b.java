package com.avito.android.advert_details_items.carousel_photogallery;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarouselPhotoGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84545a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84546b;

    /* renamed from: c, reason: collision with root package name */
    public final u f84547c;

    public b(u uVar, u uVar2, u uVar3) {
        this.f84545a = uVar;
        this.f84546b = uVar2;
        this.f84547c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f84545a.get(), (InterfaceC35845m2) this.f84546b.get(), (InterfaceC28373a) this.f84547c.get());
    }
}
