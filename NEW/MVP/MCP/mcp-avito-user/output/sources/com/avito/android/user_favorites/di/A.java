package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Collections;
import java.util.Set;

/* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes5.dex */
public final class A implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new A();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = y.f316918a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new t());
    }
}
