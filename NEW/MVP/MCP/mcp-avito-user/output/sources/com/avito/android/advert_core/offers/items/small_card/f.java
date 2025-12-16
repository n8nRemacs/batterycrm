package com.avito.android.advert_core.offers.items.small_card;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SmallCardOfferItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f83841a;

    public f(Provider<com.avito.android.advert_core.analytics.a> provider) {
        this.f83841a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f83841a.get());
    }
}
