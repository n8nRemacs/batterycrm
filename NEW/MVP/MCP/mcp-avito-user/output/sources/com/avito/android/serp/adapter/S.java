package com.avito.android.serp.adapter;

import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.FavoritesToast;
import kotlin.Metadata;

/* compiled from: FavorableItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/S;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface S extends com.avito.conveyor_item.a {

    /* compiled from: FavorableItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    String getAnalyticsContext();

    @Y61.l
    FavoritesToast getFavoritesToast();

    @Y61.l
    AdvertisementVerticalAlias getVerticalAlias();

    boolean isFavorite();

    void setFavorite(boolean z12);
}
