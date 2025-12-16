package com.avito.android.di.module;

import Wj.f;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: SerpTabFragmentFactoryModule_ProvideSerpStubFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.m9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30119m9 implements dagger.internal.h<Set<Wj.f>> {
    public static Set a(com.avito.android.employee_stub_impl.a aVar, com.avito.android.employee_stub_impl.d dVar) {
        int i12 = C30064h9.f144330a;
        f.a aVar2 = Wj.f.f18026a;
        NavigationTab navigationTab = NavigationTab.f106970f;
        C29998b9 c29998b9 = new C29998b9(dVar);
        C30020d9 c30020d9 = new C30020d9(aVar);
        aVar2.getClass();
        Set setL0 = C42756l.l0(new Wj.f[]{new Wj.e(navigationTab, c29998b9, c30020d9), new Wj.e(NavigationTab.f106975k, new C30031e9(dVar), new C30053g9(aVar))});
        dagger.internal.t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
