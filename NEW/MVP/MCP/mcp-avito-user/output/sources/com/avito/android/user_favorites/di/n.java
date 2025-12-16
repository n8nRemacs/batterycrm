package com.avito.android.user_favorites.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.favorites.tracker.FavoritesScreen;

/* compiled from: UserFavoritesModule_ProvideScreenFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<Screen> {

    /* compiled from: UserFavoritesModule_ProvideScreenFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f316903a = new n();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = i.f316897a;
        FavoritesScreen favoritesScreen = FavoritesScreen.f157546d;
        dagger.internal.t.d(favoritesScreen);
        return favoritesScreen;
    }
}
