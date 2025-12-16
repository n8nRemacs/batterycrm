package com.avito.android.user_adverts.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: UserAdvertsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: UserAdvertsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new j();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = i.f312110a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new g());
    }
}
