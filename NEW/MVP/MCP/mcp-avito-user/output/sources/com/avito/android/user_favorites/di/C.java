package com.avito.android.user_favorites.di;

import Wj.f;
import com.avito.android.bottom_navigation.NavigationTab;
import java.util.Collections;
import java.util.Set;

/* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideSerpStubFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class C implements dagger.internal.h<Set<Wj.f>> {
    public static Set a(com.avito.android.employee_stub_impl.a aVar, com.avito.android.employee_stub_impl.d dVar) {
        int i12 = y.f316918a;
        f.a aVar2 = Wj.f.f18026a;
        NavigationTab navigationTab = NavigationTab.f106971g;
        v vVar = new v(dVar);
        x xVar = new x(aVar);
        aVar2.getClass();
        return Collections.singleton(new Wj.e(navigationTab, vVar, xVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
