package com.avito.android.advert_details_items.services_discount_and_gifts;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.advert_service_discount_and_buyer_gift.AdvertServicesDiscountAndBuyerGift;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/services_discount_and_gifts/e;", "Lcom/avito/android/advert_details_items/services_discount_and_gifts/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f85668b;

    @Inject
    public e(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f85668b = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem = (AdvertDetailsServicesDiscountAndBuyerGiftItem) aVar;
        AdvertServicesDiscountAndBuyerGift.Discount discount = advertDetailsServicesDiscountAndBuyerGiftItem.f85656h;
        if (discount != null) {
            gVar.hM(discount.getTitle(), discount.getAmount(), discount.getDescription());
        }
        AdvertServicesDiscountAndBuyerGift.Gift gift = advertDetailsServicesDiscountAndBuyerGiftItem.f85655g;
        if (gift != null) {
            gVar.oQ(new d(advertDetailsServicesDiscountAndBuyerGiftItem.f85658j, advertDetailsServicesDiscountAndBuyerGiftItem.f85657i, advertDetailsServicesDiscountAndBuyerGiftItem.f85659k, this), gift.getTitle(), gift.getDescription());
        }
    }
}
