package com.avito.android.favorites.adapter.promo.with_movable_image;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo.p;
import com.avito.android.remote.model.vertical_main.PromoAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PromoItemWithMovableImagePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_movable_image/e;", "Lcom/avito/android/favorites/adapter/promo/with_movable_image/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f156703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.favorites.adapter.promo.a f156704c;

    @Inject
    public e(@k p pVar, @k com.avito.android.favorites.adapter.promo.a aVar) {
        this.f156703b = pVar;
        this.f156704c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        FavoritesPromoItem favoritesPromoItem = (FavoritesPromoItem) aVar;
        gVar.KV(favoritesPromoItem.f156649f);
        gVar.jY(favoritesPromoItem.f156646c);
        String str = favoritesPromoItem.f156647d;
        if (str == null) {
            str = "";
        }
        gVar.r6(str);
        List<PromoAction> list = favoritesPromoItem.f156648e;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        gVar.co(list, favoritesPromoItem, i12);
        gVar.xe(favoritesPromoItem.f156651h);
        this.f156704c.b(favoritesPromoItem.f156652i);
    }

    @Override // com.avito.android.favorites.adapter.promo.s
    public final void k(@k DeepLink deepLink, @k FavoritesPromoItem favoritesPromoItem) {
        this.f156704c.a(favoritesPromoItem.f156652i);
        this.f156703b.f(deepLink);
    }
}
