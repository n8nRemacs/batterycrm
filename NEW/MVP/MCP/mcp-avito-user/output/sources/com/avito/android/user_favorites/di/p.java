package com.avito.android.user_favorites.di;

import androidx.fragment.app.FragmentManager;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: UserFavoritesModule_ProvideTabPagerAdapter$_avito_user_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<TabPagerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FragmentManager> f316907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab>> f316908b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.A f316909c;

    public p(Provider provider, Provider provider2, dagger.internal.A a12) {
        this.f316907a = provider;
        this.f316908b = provider2;
        this.f316909c = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FragmentManager fragmentManager = this.f316907a.get();
        com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab> jVar = this.f316908b.get();
        Set set = (Set) this.f316909c.get();
        int i12 = i.f316897a;
        return new TabPagerAdapter(fragmentManager, jVar, set, TabPagerAdapter.Behaviour.f178131d);
    }
}
