package com.avito.android.favorites.di;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.S0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.di.module.X2;
import com.avito.android.favorites.FavoritesFragment;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.user_favorites.InterfaceC35724i;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import ob.C44742f;

/* compiled from: FavoriteAdvertsComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/di/c;", "", "a", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.favorites.di.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30645c {

    /* compiled from: FavoriteAdvertsComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/di/c$a;", "", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.di.c$a */
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        InterfaceC30645c build();

        @h31.b
        @Y61.k
        a c(@Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a d(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a f(@Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a g(@Y61.k S0 s02);

        @h31.b
        @Y61.k
        a h(@Y61.k ScreenPerformanceTracker screenPerformanceTracker);

        @h31.b
        @Y61.k
        a i(@Y61.k FavoritesFragment favoritesFragment);

        @h31.b
        @Y61.k
        a j(@Y61.k C44742f c44742f);

        @h31.b
        @Y61.k
        a k(@Y61.l @K Bundle bundle);

        @h31.b
        @Y61.k
        a l(@Y61.k FavoritesFragment favoritesFragment);

        @h31.b
        @Y61.k
        a m(@Y61.l @X2 Kundle kundle);

        @h31.b
        @Y61.k
        a n(@Y61.l InterfaceC35724i interfaceC35724i);

        @h31.b
        @Y61.k
        a o(@Y61.k Screen screen);

        @h31.b
        @Y61.k
        a p(@com.avito.android.advertising.di.v @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a q(@Y61.k RecyclerView.t tVar);

        @h31.b
        @Y61.k
        a r(@Y61.k FavoritesSpace favoritesSpace);

        @h31.b
        @Y61.k
        a s(@Y61.l @InterfaceC30073i7 Kundle kundle);

        @Y61.k
        a t(@Y61.k C31138n0 c31138n0);

        @h31.b
        @Y61.k
        a u(@Y61.k Context context);

        @Y61.k
        a v(@Y61.k InterfaceC30646d interfaceC30646d);

        @h31.b
        @Y61.k
        a w(@Y61.k FavoritesFragment favoritesFragment);

        @h31.b
        @Y61.k
        a x(@Y61.k FavoritesFragment favoritesFragment);

        @h31.b
        @Y61.k
        a y(@Y61.l Integer num);

        @h31.b
        @Y61.k
        a z(@Y61.k FavoritesFragment favoritesFragment);
    }

    void a(@Y61.k FavoritesFragment favoritesFragment);
}
