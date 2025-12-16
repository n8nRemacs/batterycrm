package com.avito.android.profile.di;

import com.avito.android.bottom_navigation.D;
import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import gD.f;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ProfileTabFragmentFactoryModule_ProvideProfileNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<Set<E>> {
    public static Set<E> a(f fVar) {
        int i12 = c.f221938a;
        b bVar = new b(fVar);
        E.a aVar = E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106974j;
        aVar.getClass();
        Set<E> setL0 = C42756l.l0(new E[]{new D(navigationTab, bVar), new D(GlobalNavigationTab.f106942k, bVar)});
        t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
