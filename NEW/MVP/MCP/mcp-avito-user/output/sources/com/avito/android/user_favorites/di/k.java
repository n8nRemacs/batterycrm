package com.avito.android.user_favorites.di;

import com.avito.android.C36133w0;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.favorites.InterfaceC30662g1;
import com.avito.android.user_favorites.di.C35717a;
import javax.inject.Provider;

/* compiled from: UserFavoritesModule_ProvideFavoritesSpace$_avito_user_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<FavoritesSpace> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30662g1> f316899a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f316900b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f316899a = provider;
        this.f316900b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C36133w0 c36133w0A4 = ((C35717a.c.C9839a) this.f316899a).f316890a.a4();
        BottomNavigationSpace bottomNavigationSpace = (BottomNavigationSpace) this.f316900b.f393949a;
        int i12 = i.f316897a;
        FavoritesSpace favoritesSpaceA = c36133w0A4.a(bottomNavigationSpace);
        dagger.internal.t.d(favoritesSpaceA);
        return favoritesSpaceA;
    }
}
