package com.avito.android.advert_core.development_offers;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentOffersItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p9.e> f83336a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f83337b;

    public i(Provider<p9.e> provider, Provider<com.avito.android.advert_core.analytics.a> provider2) {
        this.f83336a = provider;
        this.f83337b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f83336a.get(), this.f83337b.get());
    }
}
