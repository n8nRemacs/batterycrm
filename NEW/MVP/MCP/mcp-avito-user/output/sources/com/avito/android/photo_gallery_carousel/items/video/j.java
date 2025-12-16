package com.avito.android.photo_gallery_carousel.items.video;

import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryVideoItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f218034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f218035b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35845m2> f218036c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f218034a = lVar;
        this.f218035b = provider;
        this.f218036c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f218034a.f393949a, this.f218035b.get(), this.f218036c.get());
    }
}
