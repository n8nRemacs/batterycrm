package com.avito.android.bxcontent.beduin_v2.favorite;

import Y61.l;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.AdvertisementVerticalAliasKt;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.serp.adapter.S;
import com.avito.conveyor_item.a;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;

/* compiled from: BxFavoriteButtonComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/favorite/b;", "Lcom/avito/android/serp/adapter/S;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements S {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f109521b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AdvertisementVerticalAlias f109522c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f109523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f109524e;

    public b(g gVar, CheckableImageButton checkableImageButton) {
        this.f109524e = checkableImageButton;
        this.f109521b = gVar.f109538c;
        String str = gVar.f109540e;
        this.f109522c = str != null ? AdvertisementVerticalAliasKt.toVerticalAlias(new NameIdEntity(str, null)) : null;
        this.f109523d = gVar.f109536a;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF109521b() {
        return this.f109521b;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getFavoritesToast */
    public final FavoritesToast getF107480p() {
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF109523d() {
        return this.f109523d;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF109522c() {
        return this.f109522c;
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite */
    public final boolean getF107475k() {
        return !this.f109524e.f356716b;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
    }
}
