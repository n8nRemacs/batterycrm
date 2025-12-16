package com.avito.android.favorites.adapter.promo;

import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PromoItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/u;", "LTV0/e;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface u extends TV0.e {

    /* compiled from: PromoItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void KV(@Y61.k PromoStyle promoStyle);

    void W2();

    void co(@Y61.k List<PromoAction> list, @Y61.k FavoritesPromoItem favoritesPromoItem, int i12);

    void jY(@Y61.k String str);

    void r6(@Y61.k String str);

    void v8();
}
