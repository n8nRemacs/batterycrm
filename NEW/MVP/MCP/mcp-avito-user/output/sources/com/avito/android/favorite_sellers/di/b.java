package com.avito.android.favorite_sellers.di;

import K60.a;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.favorite_sellers.FavoriteSellersFragment;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30575a;
import com.avito.android.favorite_sellers.di.d;
import com.avito.android.favorite_sellers.tracker.FavoriteSellersScreen;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: FavoriteSellersComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/di/b;", "", "a", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: FavoriteSellersComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/di/b$a;", "", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@d.b @h31.b @Y61.l String str, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k S0 s02, @h31.b @Y61.k Resources resources, @com.avito.android.favorite_sellers.adapter.advert_list.di.g @h31.b @Y61.l Kundle kundle, @h31.b @Y61.l @InterfaceC30575a Kundle kundle2, @a.c @h31.b @Y61.k FavoriteSellersScreen favoriteSellersScreen, @h31.b @a.b @Y61.k r rVar, @Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k FavoriteSellersFragment favoriteSellersFragment);
}
