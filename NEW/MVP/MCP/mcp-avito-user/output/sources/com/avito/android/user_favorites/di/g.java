package com.avito.android.user_favorites.di;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.user_favorites.M;
import com.avito.android.user_favorites.UserFavoritesFragment;
import com.avito.android.util.Kundle;
import h31.d;
import kotlin.Metadata;

/* compiled from: UserFavoritesComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_favorites/di/g;", "", "a", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: UserFavoritesComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/di/g$a;", "", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(@Y61.k h hVar, @h31.b @Y61.k BottomNavigationSpace bottomNavigationSpace, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @Y61.l Kundle kundle, @h31.b @Y61.k UserFavoritesFragment userFavoritesFragment, @h31.b @Y61.k M m12, @d @h31.b int i12, @h31.b @Y61.l Integer num);
    }

    void a(@Y61.k UserFavoritesFragment userFavoritesFragment);
}
