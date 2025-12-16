package com.avito.android.di.module;

import com.avito.android.bottom_navigation.InterfaceC28896s;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: SerpTabFragmentFactoryModule_ProvideContainerTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.di.module.j9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30086j9 implements dagger.internal.h<Set<InterfaceC28896s>> {

    /* compiled from: SerpTabFragmentFactoryModule_ProvideContainerTabFragmentFactoriesFactory.java */
    /* renamed from: com.avito.android.di.module.j9$a */
    public static final class a {
        static {
            new C30086j9();
        }
    }

    public static Set<InterfaceC28896s> a() {
        int i12 = C30064h9.f144330a;
        InterfaceC28896s.a aVar = InterfaceC28896s.f107063a;
        NavigationTab navigationTab = NavigationTab.f106970f;
        TabContainerWithStubFragmentImpl.a aVar2 = TabContainerWithStubFragmentImpl.f107110l0;
        R8 r82 = new R8(1, aVar2, TabContainerWithStubFragmentImpl.a.class, "create", "create(Lcom/avito/android/bottom_navigation/NavigationTabSetItem;)Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerWithStubFragmentImpl;", 0);
        aVar.getClass();
        Set<InterfaceC28896s> setL0 = C42756l.l0(new InterfaceC28896s[]{new com.avito.android.bottom_navigation.r(navigationTab, r82), new com.avito.android.bottom_navigation.r(NavigationTab.f106975k, new S8(1, aVar2, TabContainerWithStubFragmentImpl.a.class, "create", "create(Lcom/avito/android/bottom_navigation/NavigationTabSetItem;)Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerWithStubFragmentImpl;", 0))});
        dagger.internal.t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
