package com.avito.android.user_advert.advert.items.auction_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AuctionBannerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309221a;

    public c(Provider<d> provider) {
        this.f309221a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309221a.get());
    }
}
