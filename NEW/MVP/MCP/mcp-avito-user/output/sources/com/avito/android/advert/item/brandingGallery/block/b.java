package com.avito.android.advert.item.brandingGallery.block;

import Oi0.C14700d;
import com.avito.android.util.L0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingGalleryBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f74133a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f74134b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C14700d> f74135c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<L0> f74136d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f74137e;

    public b(d dVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f74133a = dVar;
        this.f74134b = provider;
        this.f74135c = provider2;
        this.f74136d = provider3;
        this.f74137e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f74133a.getClass();
        return new a(new c(), this.f74134b.get(), this.f74135c.get(), this.f74136d.get(), this.f74137e.get());
    }
}
