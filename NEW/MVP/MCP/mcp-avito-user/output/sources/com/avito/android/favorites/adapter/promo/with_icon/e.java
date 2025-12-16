package com.avito.android.favorites.adapter.promo.with_icon;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo.p;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoItemWithIconPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_icon/e;", "Lcom/avito/android/favorites/adapter/promo/with_icon/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f156688b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f156689c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.favorites.adapter.promo.a f156690d;

    @Inject
    public e(@k com.avito.android.favorites.adapter.promo.a aVar, @k p pVar, @k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f156688b = bVar;
        this.f156689c = pVar;
        this.f156690d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        FavoritesPromoItem favoritesPromoItem = (FavoritesPromoItem) aVar;
        this.f156688b.a(gVar, favoritesPromoItem);
        gVar.KV(favoritesPromoItem.f156649f);
        String str = favoritesPromoItem.f156647d;
        if (str == null || str.length() == 0) {
            gVar.v8();
        } else {
            gVar.r6(str);
        }
        gVar.A2(favoritesPromoItem.f156650g);
        List<PromoAction> list = favoritesPromoItem.f156648e;
        if (!O2.a(list)) {
            gVar.W2();
        } else if (list != null) {
            gVar.co(list, favoritesPromoItem, i12);
        }
    }

    @Override // com.avito.android.favorites.adapter.promo.s
    public final void k(@k DeepLink deepLink, @k FavoritesPromoItem favoritesPromoItem) {
        this.f156690d.a(favoritesPromoItem.f156652i);
        this.f156689c.f(deepLink);
    }
}
