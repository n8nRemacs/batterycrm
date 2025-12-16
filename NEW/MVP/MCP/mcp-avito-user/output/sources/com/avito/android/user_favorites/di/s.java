package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: UserFavoritesTabFragmentFactoryModule.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class s extends H implements Y41.l<NavigationTabSetItem, TabContainerWithStubFragmentImpl> {
    @Override // Y41.l
    public final TabContainerWithStubFragmentImpl invoke(NavigationTabSetItem navigationTabSetItem) {
        ((TabContainerWithStubFragmentImpl.a) this.receiver).getClass();
        return TabContainerWithStubFragmentImpl.a.a(navigationTabSetItem);
    }
}
