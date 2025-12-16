package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.services_discount_and_gifts.AdvertDetailsServicesDiscountAndBuyerGiftItem;
import com.avito.android.remote.model.advert_service_discount_and_buyer_gift.AdvertServicesDiscountAndBuyerGift;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/y4;", "Lcom/avito/android/advert/item/blocks/items_factories/x4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.y4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28085y4 implements InterfaceC28079x4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74085a;

    @Inject
    public C28085y4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74085a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28079x4
    @Y61.k
    public final AdvertDetailsServicesDiscountAndBuyerGiftItem a(@Y61.l AdvertServicesDiscountAndBuyerGift.Gift gift, @Y61.l AdvertServicesDiscountAndBuyerGift.Discount discount, @Y61.l Long l12, @Y61.l Long l13, @Y61.l String str) {
        return new AdvertDetailsServicesDiscountAndBuyerGiftItem(0L, null, this.f74085a.a(), null, null, gift, discount, l12, l13, str, 27, null);
    }
}
