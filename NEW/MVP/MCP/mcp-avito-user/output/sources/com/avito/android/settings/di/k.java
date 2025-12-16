package com.avito.android.settings.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: SettingsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: SettingsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new k();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = j.f280880a;
        int i13 = InterfaceC28898u.f107086a;
        return Collections.singleton(new i());
    }
}
