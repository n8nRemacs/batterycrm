package com.avito.android.advert.item.realty_quiz_banner;

import Up0.InterfaceC15557a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyQuizBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f78372a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f78373b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f78374c;

    public i(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f78372a = fVar;
        this.f78373b = fVar2;
        this.f78374c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC15557a) this.f78372a.get(), (c) this.f78373b.get(), this.f78374c.get());
    }
}
