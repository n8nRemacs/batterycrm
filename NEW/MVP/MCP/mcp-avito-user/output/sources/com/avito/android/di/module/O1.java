package com.avito.android.di.module;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Collections;
import java.util.Set;

/* compiled from: AvitoForBusinessTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class O1 implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: AvitoForBusinessTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new O1();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = N1.f144079a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new L1());
    }
}
