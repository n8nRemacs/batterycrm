package com.avito.android.user_adverts.di;

import com.avito.android.bottom_navigation.D;
import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: UserAdvertsTabFragmentFactoryModule_ProvideUserAdvertsNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<Set<E>> {

    /* compiled from: UserAdvertsTabFragmentFactoryModule_ProvideUserAdvertsNavigationTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new k();
        }
    }

    public static Set<E> a() {
        int i12 = i.f312110a;
        h hVar = h.f311949l;
        E.a aVar = E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106972h;
        aVar.getClass();
        Set<E> setL0 = C42756l.l0(new E[]{new D(navigationTab, hVar), new D(GlobalNavigationTab.f106939h, hVar)});
        t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
