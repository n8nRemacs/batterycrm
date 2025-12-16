package com.avito.android.favorite_sellers.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSellersModule_ProvideFromPageSource$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<FromPageSource> {

    /* compiled from: FavoriteSellersModule_ProvideFromPageSource$_avito_favorite_sellers_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f155880a = new k();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f155872a.getClass();
        FromPageSource.FavoriteSellers favoriteSellers = FromPageSource.FavoriteSellers.f82328c;
        t.d(favoriteSellers);
        return favoriteSellers;
    }
}
