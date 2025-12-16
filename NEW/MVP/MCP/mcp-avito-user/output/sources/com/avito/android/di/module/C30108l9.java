package com.avito.android.di.module;

import com.avito.android.bottom_navigation.E;
import com.avito.android.bottom_navigation.GlobalNavigationTab;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: SerpTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.di.module.l9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30108l9 implements dagger.internal.h<Set<com.avito.android.bottom_navigation.E>> {

    /* compiled from: SerpTabFragmentFactoryModule_ProvideNavigationTabFragmentFactoriesFactory.java */
    /* renamed from: com.avito.android.di.module.l9$a */
    public static final class a {
        static {
            new C30108l9();
        }
    }

    public static Set<com.avito.android.bottom_navigation.E> a() {
        int i12 = C30064h9.f144330a;
        C29987a9 c29987a9 = C29987a9.f144231l;
        E.a aVar = com.avito.android.bottom_navigation.E.f106931a;
        NavigationTab navigationTab = NavigationTab.f106970f;
        aVar.getClass();
        Set<com.avito.android.bottom_navigation.E> setL0 = C42756l.l0(new com.avito.android.bottom_navigation.E[]{new com.avito.android.bottom_navigation.D(navigationTab, c29987a9), new com.avito.android.bottom_navigation.D(GlobalNavigationTab.f106937f, c29987a9)});
        dagger.internal.t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
