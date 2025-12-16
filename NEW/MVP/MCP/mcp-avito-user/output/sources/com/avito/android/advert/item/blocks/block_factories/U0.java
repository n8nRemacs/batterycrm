package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory;
import com.avito.android.advert.item.hotel.hotel_description.AdvertHotelDescriptionItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.hotel.model.AdvertHotel;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsHotelGuestInfoBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/U0;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U0 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsHotelDescriptionItemFactory f73495a;

    @Inject
    public U0(@Y61.k AdvertDetailsHotelDescriptionItemFactory advertDetailsHotelDescriptionItemFactory) {
        this.f73495a = advertDetailsHotelDescriptionItemFactory;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertHotel hotel = bVar.f83013a.f82645b.getHotel();
        AdvertHotelDescriptionItem advertHotelDescriptionItemA = this.f73495a.a(hotel != null ? hotel.getGuestInfoDescription() : null, AdvertDetailsHotelDescriptionItemFactory.HotelDescriptionType.f73702c);
        if (advertHotelDescriptionItemA != null) {
            return Collections.singletonList(advertHotelDescriptionItemA);
        }
        return null;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
