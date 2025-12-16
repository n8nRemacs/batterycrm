package com.avito.android.advert.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.advert.di.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27708q implements dagger.internal.h<Set<InterfaceC28898u>> {

    /* compiled from: AdvertDetailsTabFragmentFactoryModule_ProvideDataTabFragmentFactoriesFactory.java */
    /* renamed from: com.avito.android.advert.di.q$a */
    public static final class a {
        static {
            new C27708q();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = C27707p.f69459a;
        int i13 = InterfaceC28898u.f107086a;
        Set setL0 = C42756l.l0(new InterfaceC28898u[]{new C27705n(), new C27706o()});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
