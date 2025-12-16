package com.avito.android.item_map.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ItemMapTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: ItemMapTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new n();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = m.f173334a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new l());
    }
}
