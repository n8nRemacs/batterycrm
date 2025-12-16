package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: MessengerTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<Set<com.avito.android.bottom_navigation.E>> {

    /* compiled from: MessengerTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new K();
        }
    }

    public static Set<com.avito.android.bottom_navigation.E> a() {
        int i12 = I.f187425a;
        H h12 = H.f187424l;
        E.a aVar = com.avito.android.bottom_navigation.E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106973i;
        aVar.getClass();
        Set<com.avito.android.bottom_navigation.E> setL0 = C42756l.l0(new com.avito.android.bottom_navigation.E[]{new com.avito.android.bottom_navigation.D(navigationTab, h12), new com.avito.android.bottom_navigation.D(GlobalNavigationTab.f106941j, h12)});
        dagger.internal.t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
