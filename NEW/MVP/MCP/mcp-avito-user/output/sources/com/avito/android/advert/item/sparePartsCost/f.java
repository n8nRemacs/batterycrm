package com.avito.android.advert.item.sparePartsCost;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SparePartsCostItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80389a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f80390b;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.advert_core.analytics.a> provider2) {
        this.f80389a = provider;
        this.f80390b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f80389a.get(), this.f80390b.get());
    }
}
