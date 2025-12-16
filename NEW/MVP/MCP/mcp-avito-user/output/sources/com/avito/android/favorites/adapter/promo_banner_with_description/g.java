package com.avito.android.favorites.adapter.promo_banner_with_description;

import Yo.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoBannerRecallWithDescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_description/g;", "LTV0/d;", "Lcom/avito/android/favorites/adapter/promo_banner_with_description/j;", "Lcom/avito/android/favorites/adapter/promo_banner_with_description/PromoBannerRecallWithDescriptionItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements TV0.d<j, PromoBannerRecallWithDescriptionItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KC.b f156780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f156781c;

    @Inject
    public g(@Y61.k KC.b bVar, @Y61.k p pVar) {
        this.f156780b = bVar;
        this.f156781c = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem = (PromoBannerRecallWithDescriptionItem) aVar;
        ((j) eVar).gV(promoBannerRecallWithDescriptionItem, new c(this, promoBannerRecallWithDescriptionItem), new d(this), new e(this, promoBannerRecallWithDescriptionItem), new f(this));
        this.f156781c.a(null, "favorites", "middle", "rre_trx_favorites_2024_v1");
    }
}
