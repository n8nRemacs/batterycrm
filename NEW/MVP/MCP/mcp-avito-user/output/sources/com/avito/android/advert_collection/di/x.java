package com.avito.android.advert_collection.di;

import com.avito.android.advert_collection.tracker.FavoritesCollectionsScreen;
import com.avito.android.analytics.screens.Screen;

/* compiled from: AdvertCollectionModule_ProvideScreenFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes10.dex */
public final class x implements dagger.internal.h<Screen> {

    /* compiled from: AdvertCollectionModule_ProvideScreenFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final x f81489a = new x();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s.f81480a.getClass();
        FavoritesCollectionsScreen favoritesCollectionsScreen = FavoritesCollectionsScreen.f81698d;
        dagger.internal.t.d(favoritesCollectionsScreen);
        return favoritesCollectionsScreen;
    }
}
