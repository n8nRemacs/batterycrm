package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import javax.inject.Provider;

/* compiled from: GridGalleryBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f217408a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f217409b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_gallery.grid_gallery.l f217410c;

    /* renamed from: d, reason: collision with root package name */
    public final m f217411d;

    public w(dagger.internal.l lVar, Provider provider, com.avito.android.photo_gallery.grid_gallery.l lVar2, m mVar) {
        this.f217408a = lVar;
        this.f217409b = provider;
        this.f217410c = lVar2;
        this.f217411d = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        GridGalleryOpenParams gridGalleryOpenParams = (GridGalleryOpenParams) this.f217408a.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f217409b.get();
        com.avito.android.photo_gallery.grid_gallery.j jVar = (com.avito.android.photo_gallery.grid_gallery.j) this.f217410c.get();
        this.f217411d.getClass();
        return new v(gridGalleryOpenParams, aVar, jVar, new l());
    }
}
