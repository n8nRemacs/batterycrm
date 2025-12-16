package com.avito.android.advert_details_items.buyer_bonuses;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonusesInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BuyerBonusesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/buyer_bonuses/f;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f {
    void B00(@k BuyerBonuses buyerBonuses);

    void Si(@l String str, @l String str2);

    void X70(boolean z12);

    void bB(@l BuyerBonusesInfo buyerBonusesInfo, @k Y41.l<? super DeepLink, G0> lVar);

    void fa();
}
