package com.avito.android.photo_gallery_carousel.items.beduin_teaser;

import bj.InterfaceC25659b;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: GalleryBeduinItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f217892a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f217893b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f217894c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC39737b> f217895d;

    public b(d dVar, Provider provider, Provider provider2, Provider provider3) {
        this.f217892a = dVar;
        this.f217893b = provider;
        this.f217894c = provider2;
        this.f217895d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f217892a.getClass();
        return new a(new c(), this.f217893b.get(), this.f217894c.get(), this.f217895d.get());
    }
}
