package com.avito.android.extended_profile_tabs.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ExtendedProfileTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class d implements h<Set<InterfaceC28898u>> {

    /* compiled from: ExtendedProfileTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new d();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = c.f153198a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new b());
    }
}
