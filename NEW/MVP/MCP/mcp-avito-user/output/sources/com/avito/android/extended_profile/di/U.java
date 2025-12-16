package com.avito.android.extended_profile.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Collections;
import java.util.Set;

/* compiled from: ExtendedProfileTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class U implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: ExtendedProfileTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new U();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = T.f149550a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new S());
    }
}
