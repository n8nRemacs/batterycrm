package com.avito.android.favorites.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: FavoriteAdvertsModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<FromPageSource> {

    /* compiled from: FavoriteAdvertsModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f157349a = new r();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30647e.f157320a.getClass();
        FromPageSource.Favorites favorites = FromPageSource.Favorites.f82329c;
        dagger.internal.t.d(favorites);
        return favorites;
    }
}
