package com.avito.android.extended_profile_serp.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Collections;
import java.util.Set;

/* compiled from: ExtendedProfileSerpTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: ExtendedProfileSerpTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new K();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = J.f152671a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new I());
    }
}
