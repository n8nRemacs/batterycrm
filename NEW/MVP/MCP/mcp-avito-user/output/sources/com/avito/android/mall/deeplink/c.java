package com.avito.android.mall.deeplink;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: MallFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: MallFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new c();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = b.f184261a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new com.avito.android.mall.deeplink.a());
    }
}
