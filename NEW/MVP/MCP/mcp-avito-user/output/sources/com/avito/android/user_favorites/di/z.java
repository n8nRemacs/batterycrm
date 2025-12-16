package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.InterfaceC28896s;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl;
import java.util.Collections;
import java.util.Set;

/* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideContainerTabFragmentFactoriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes5.dex */
public final class z implements dagger.internal.h<Set<InterfaceC28896s>> {

    /* compiled from: UserFavoritesTabFragmentFactoryModule_ProvideContainerTabFragmentFactoriesFactory.java */
    public static final class a {
        static {
            new z();
        }
    }

    public static Set<InterfaceC28896s> a() {
        int i12 = y.f316918a;
        InterfaceC28896s.a aVar = InterfaceC28896s.f107063a;
        NavigationTab navigationTab = NavigationTab.f106971g;
        s sVar = new s(1, TabContainerWithStubFragmentImpl.f107110l0, TabContainerWithStubFragmentImpl.a.class, "create", "create(Lcom/avito/android/bottom_navigation/NavigationTabSetItem;)Lcom/avito/android/bottom_navigation/ui/fragment/TabContainerWithStubFragmentImpl;", 0);
        aVar.getClass();
        return Collections.singleton(new com.avito.android.bottom_navigation.r(navigationTab, sVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a();
    }
}
