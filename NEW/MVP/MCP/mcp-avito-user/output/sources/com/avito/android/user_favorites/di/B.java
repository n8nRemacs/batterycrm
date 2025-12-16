package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.D;
import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes5.dex */
public final class B implements dagger.internal.h<Set<E>> {

    /* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new B();
        }
    }

    public static Set<E> a() {
        int i12 = y.f316918a;
        u uVar = u.f316913l;
        E.a aVar = E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106971g;
        aVar.getClass();
        Set<E> setL0 = C42756l.l0(new E[]{new D(navigationTab, uVar), new D(GlobalNavigationTab.f106938g, uVar)});
        dagger.internal.t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
