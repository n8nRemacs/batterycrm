package com.avito.android.favorites.adapter.promo_banner_with_description;

import Yo.p;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoBannerRecallWithDescriptionPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f156782a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<p> f156783b;

    public i(l lVar, Provider provider) {
        this.f156782a = lVar;
        this.f156783b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((KC.b) this.f156782a.f393949a, this.f156783b.get());
    }
}
