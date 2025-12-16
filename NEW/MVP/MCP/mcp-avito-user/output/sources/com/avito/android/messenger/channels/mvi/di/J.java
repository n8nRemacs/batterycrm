package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: MessengerTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: MessengerTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new J();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = I.f187425a;
        int i13 = InterfaceC28898u.f107086a;
        Set setL0 = C42756l.l0(new InterfaceC28898u[]{new F(), new G()});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
