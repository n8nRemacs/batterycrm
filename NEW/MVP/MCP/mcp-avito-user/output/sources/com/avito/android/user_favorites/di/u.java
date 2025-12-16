package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.user_favorites.UserFavoritesFragment;
import com.avito.android.user_favorites.UserFavoritesOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserFavoritesTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/user_favorites/UserFavoritesFragment;", "it", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class u extends N implements Y41.l<NavigationTabSetItem, UserFavoritesFragment> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f316913l = new u();

    public u() {
        super(1);
    }

    @Override // Y41.l
    public final UserFavoritesFragment invoke(NavigationTabSetItem navigationTabSetItem) {
        UserFavoritesFragment.a aVar = UserFavoritesFragment.f316801D0;
        UserFavoritesOpenParams userFavoritesOpenParams = new UserFavoritesOpenParams(-1, null, null, 6, null);
        aVar.getClass();
        UserFavoritesFragment userFavoritesFragment = new UserFavoritesFragment();
        userFavoritesFragment.f316812z0.setValue(userFavoritesFragment, UserFavoritesFragment.f316802E0[0], userFavoritesOpenParams);
        return userFavoritesFragment;
    }
}
