package com.avito.android.favorites.adapter.promo;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FavoritesPromoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/m;", "Lcom/avito/android/favorites/adapter/promo/l;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f156662b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f156663c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.b f156664d;

    @Inject
    public m(@Y61.k a aVar, @Y61.k p pVar, @Y61.k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f156662b = pVar;
        this.f156663c = aVar;
        this.f156664d = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        u uVar = (u) eVar;
        FavoritesPromoItem favoritesPromoItem = (FavoritesPromoItem) aVar;
        List<PromoAction> list = favoritesPromoItem.f156648e;
        List<PromoAction> list2 = list;
        String str = favoritesPromoItem.f156647d;
        if ((list2 == null || list2.isEmpty()) && (str == null || C43066x.K(str))) {
            return;
        }
        this.f156664d.a(uVar, favoritesPromoItem);
        uVar.KV(favoritesPromoItem.f156649f);
        uVar.jY(favoritesPromoItem.f156646c);
        if (str == null || str.length() == 0) {
            uVar.v8();
        } else {
            uVar.r6(str);
        }
        if (!O2.a(list)) {
            uVar.W2();
        } else if (list != null) {
            uVar.co(list, favoritesPromoItem, i12);
        }
        this.f156663c.b(favoritesPromoItem.f156652i);
    }

    @Override // com.avito.android.favorites.adapter.promo.s
    public final void k(@Y61.k DeepLink deepLink, @Y61.k FavoritesPromoItem favoritesPromoItem) {
        this.f156663c.a(favoritesPromoItem.f156652i);
        this.f156662b.f(deepLink);
    }
}
