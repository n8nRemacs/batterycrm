package com.avito.android.favorites;

import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.favorites.FavoritesFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesActivity.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorites/FavoritesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: FavoritesActivity.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/FavoritesActivity$a;", "", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_favorites;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            FavoritesFragment.a aVar = FavoritesFragment.f156217a1;
            FavoritesFragmentParams favoritesFragmentParams = new FavoritesFragmentParams(FavoritesSpace.f156264f, null, 2, null);
            aVar.getClass();
            FavoritesFragment favoritesFragment = new FavoritesFragment();
            favoritesFragment.f156239U0.setValue(favoritesFragment, FavoritesFragment.f156218b1[0], favoritesFragmentParams);
            hE2.j(R.id.fragment_container, favoritesFragment, null, 1);
            hE2.e();
        }
    }
}
