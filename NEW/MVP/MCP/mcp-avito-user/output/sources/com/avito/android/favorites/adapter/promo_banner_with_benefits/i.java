package com.avito.android.favorites.adapter.promo_banner_with_benefits;

import Yo.p;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoBannerRecallWithBenefitsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f156740a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<p> f156741b;

    public i(l lVar, Provider provider) {
        this.f156740a = lVar;
        this.f156741b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((KC.b) this.f156740a.f393949a, this.f156741b.get());
    }
}
