package com.avito.android.search.subscriptions.di;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.search.subscriptions.SearchSubscriptionFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/subscriptions/di/c;", "", "a", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SearchSubscriptionComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/subscriptions/di/c$a;", "", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@Y61.k d dVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @Y61.k Context context, @h31.b @Y61.k Resources resources, @h31.b @Y61.k FavoritesSpace favoritesSpace);
    }

    void a(@Y61.k SearchSubscriptionFragment searchSubscriptionFragment);
}
