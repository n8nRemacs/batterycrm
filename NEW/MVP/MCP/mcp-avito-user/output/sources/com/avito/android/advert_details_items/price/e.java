package com.avito.android.advert_details_items.price;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem;
import com.avito.android.advert_details_items.price_hint.PriceHintItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsPricePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price/e;", "Lcom/avito/android/advert_details_items/price/c;", "Lcom/avito/android/advert_details_items/buyer_bonuses/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c, com.avito.android.advert_details_items.buyer_bonuses.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.price_hint.f f85174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.buyer_bonuses.c f85175c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f85176d;

    @Inject
    public e(@Y61.k com.avito.android.advert_details_items.price_hint.f fVar, @Y61.k com.avito.android.advert_details_items.buyer_bonuses.c cVar, @Y61.k j jVar) {
        this.f85174b = fVar;
        this.f85175c = cVar;
        this.f85176d = jVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        g gVar = (g) eVar;
        AdvertDetailsPriceItem advertDetailsPriceItem = (AdvertDetailsPriceItem) aVar;
        d dVar = new d(advertDetailsPriceItem, this, gVar);
        boolean z12 = advertDetailsPriceItem.f85150n;
        if (advertDetailsPriceItem.f85153q) {
            gVar.GT(advertDetailsPriceItem.f85140d, advertDetailsPriceItem.f85143g, advertDetailsPriceItem.f85141e, advertDetailsPriceItem.f85144h, advertDetailsPriceItem.f85142f);
            gVar.ZS(dVar);
        } else {
            String str2 = advertDetailsPriceItem.f85143g;
            String str3 = advertDetailsPriceItem.f85140d;
            if (str3 == null || (str = advertDetailsPriceItem.f85142f) == null || C43066x.K(str)) {
                String str4 = advertDetailsPriceItem.f85144h;
                if (z12) {
                    gVar.YQ(str3, str2, str4);
                    gVar.ZS(dVar);
                } else {
                    gVar.BP(str3, str2, str4);
                }
            } else {
                gVar.a20(str3, str, str2, advertDetailsPriceItem.f85149m);
            }
        }
        if (advertDetailsPriceItem.f85146j) {
            gVar.Fw(z12);
        }
        PriceHintItem priceHintItem = advertDetailsPriceItem.f85147k;
        if (priceHintItem != null) {
            this.f85174b.O5(gVar, priceHintItem, i12);
        }
        BuyerBonusesItem buyerBonusesItem = advertDetailsPriceItem.f85148l;
        if (buyerBonusesItem != null) {
            this.f85175c.k(gVar, buyerBonusesItem, i12);
        }
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.c
    public final void k(@Y61.k com.avito.android.advert_details_items.buyer_bonuses.f fVar, @Y61.k BuyerBonusesItem buyerBonusesItem, int i12) {
        this.f85175c.k(fVar, buyerBonusesItem, i12);
    }
}
