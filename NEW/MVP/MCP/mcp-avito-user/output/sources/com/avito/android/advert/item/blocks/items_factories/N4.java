package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_details_items.work_time.AdvertDetailsServicesWorkTimeItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ServicesWorkTime;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesWorkTimeItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/N4;", "Lcom/avito/android/advert/item/blocks/items_factories/M4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N4 implements M4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73815a;

    @Inject
    public N4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73815a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.M4
    @Y61.l
    public final AdvertDetailsServicesWorkTimeItem a(@Y61.k AdvertDetails advertDetails) {
        ServicesWorkTime servicesWorkTime;
        AdvertDetails.AdvertisementStyle advertisementStyle = advertDetails.getAdvertisementStyle();
        if ((advertisementStyle != null && advertisementStyle != AdvertDetails.AdvertisementStyle.Default) || (servicesWorkTime = advertDetails.getServicesWorkTime()) == null) {
            return null;
        }
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsServicesWorkTimeItem(servicesWorkTime.getCommon(), servicesWorkTime.getDetails() != null ? servicesWorkTime.getDelimeter() : null, servicesWorkTime.getDetails(), this.f73815a.a(), "ITEM_SERVICES_WORK_TIME", null, null, 96, null);
    }
}
