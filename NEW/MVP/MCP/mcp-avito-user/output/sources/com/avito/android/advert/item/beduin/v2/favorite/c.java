package com.avito.android.advert.item.beduin.v2.favorite;

import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.serp.adapter.S;
import com.avito.conveyor_item.a;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;

/* compiled from: FavoriteButtonComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/favorite/c;", "Lcom/avito/android/serp/adapter/S;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements S {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f73318b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertisementVerticalAlias f73319c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f73320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f73321e;

    public c(String str, AdvertisementVerticalAlias advertisementVerticalAlias, j jVar, CheckableImageButton checkableImageButton) {
        this.f73321e = checkableImageButton;
        this.f73318b = str;
        this.f73319c = advertisementVerticalAlias;
        this.f73320d = jVar.f73338a;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF73318b() {
        return this.f73318b;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast */
    public final FavoritesToast getF107480p() {
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF73320d() {
        return this.f73320d;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF73319c() {
        return this.f73319c;
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite */
    public final boolean getF107475k() {
        return !this.f73321e.f356716b;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
    }
}
