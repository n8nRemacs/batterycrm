package com.avito.android.bxcontent.di.module;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Collections;
import java.util.Set;

/* compiled from: BxContentTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes12.dex */
public final class Y implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: BxContentTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new Y();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = X.f110903a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new W());
    }
}
