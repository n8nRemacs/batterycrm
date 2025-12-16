package com.avito.android.serp.adapter.carousel_gig;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselGigShiftPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f269097a;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f269097a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f269097a.get());
    }
}
