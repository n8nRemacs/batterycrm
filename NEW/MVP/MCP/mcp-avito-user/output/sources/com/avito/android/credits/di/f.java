package com.avito.android.credits.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: CreditBrokerTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: CreditBrokerTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new f();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = e.f128853a;
        int i13 = InterfaceC28898u.f107086a;
        Set setL0 = C42756l.l0(new InterfaceC28898u[]{new c(), new d()});
        t.d(setL0);
        return setL0;
    }
}
