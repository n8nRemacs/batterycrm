package com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SellerCarouselItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<vC.b>> f155609a;

    public j(Provider<Y1<vC.b>> provider) {
        this.f155609a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f155609a.get());
    }
}
