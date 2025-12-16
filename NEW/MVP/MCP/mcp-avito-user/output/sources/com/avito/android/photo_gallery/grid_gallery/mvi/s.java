package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: GridGalleryActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f217390a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f217391b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f217392c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.photo_gallery.grid_gallery.l f217393d;

    public s(dagger.internal.l lVar, Provider provider, Provider provider2, com.avito.android.photo_gallery.grid_gallery.l lVar2) {
        this.f217390a = lVar;
        this.f217391b = provider;
        this.f217392c = provider2;
        this.f217393d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((GridGalleryOpenParams) this.f217390a.f393949a, this.f217391b.get(), this.f217392c.get(), (com.avito.android.photo_gallery.grid_gallery.j) this.f217393d.get());
    }
}
