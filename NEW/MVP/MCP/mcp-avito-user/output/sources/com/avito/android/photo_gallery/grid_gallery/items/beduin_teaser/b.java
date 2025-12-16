package com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser;

import bj.InterfaceC25659b;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: GridGalleryBeduinTeaserBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f217234a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_gallery.grid_gallery.di.f f217235b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f217236c;

    public b(e eVar, com.avito.android.photo_gallery.grid_gallery.di.f fVar, Provider provider) {
        this.f217234a = eVar;
        this.f217235b = fVar;
        this.f217236c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f217234a.get(), (InterfaceC40691b) this.f217235b.get(), this.f217236c.get());
    }
}
