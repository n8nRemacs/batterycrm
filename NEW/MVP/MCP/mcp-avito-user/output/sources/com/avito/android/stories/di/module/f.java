package com.avito.android.stories.di.module;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: StoriesTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class f implements h<Set<InterfaceC28898u>> {

    /* compiled from: StoriesTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new f();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = e.f285140a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new d());
    }
}
