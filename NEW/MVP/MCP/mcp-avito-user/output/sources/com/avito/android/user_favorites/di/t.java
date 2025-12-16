package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_favorites.UserFavoritesFragment;
import com.avito.android.user_favorites.UserFavoritesFragmentData;
import com.avito.android.user_favorites.UserFavoritesOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return UserFavoritesFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        UserFavoritesFragmentData userFavoritesFragmentData = (UserFavoritesFragmentData) data;
        UserFavoritesFragment.a aVar = UserFavoritesFragment.f316801D0;
        UserFavoritesOpenParams userFavoritesOpenParams = new UserFavoritesOpenParams(userFavoritesFragmentData.f316822b, userFavoritesFragmentData.f316824d, userFavoritesFragmentData.f316823c);
        aVar.getClass();
        UserFavoritesFragment userFavoritesFragment = new UserFavoritesFragment();
        userFavoritesFragment.f316812z0.setValue(userFavoritesFragment, UserFavoritesFragment.f316802E0[0], userFavoritesOpenParams);
        return userFavoritesFragment;
    }
}
