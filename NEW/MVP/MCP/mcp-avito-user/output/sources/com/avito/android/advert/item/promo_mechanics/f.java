package com.avito.android.advert.item.promo_mechanics;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoMechanicsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f78264a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f78264a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f78264a.get());
    }
}
