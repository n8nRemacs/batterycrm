package com.avito.android.di.module;

import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Collections;
import java.util.Set;
import rg.C47652a;

/* compiled from: AvitoForBusinessTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class P1 implements dagger.internal.h<Set<com.avito.android.bottom_navigation.E>> {
    public static Set<com.avito.android.bottom_navigation.E> a(C47652a c47652a) {
        int i12 = N1.f144079a;
        E.a aVar = com.avito.android.bottom_navigation.E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106975k;
        M1 m12 = new M1(c47652a);
        aVar.getClass();
        return Collections.singleton(new com.avito.android.bottom_navigation.D(navigationTab, m12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
