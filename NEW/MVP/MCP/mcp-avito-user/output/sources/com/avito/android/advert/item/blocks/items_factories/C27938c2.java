package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory;
import com.avito.android.advert.item.hotel.hotel_description.AdvertHotelDescriptionItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.hotel.model.AdvertHotelDescription;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsHotelDescriptionItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/c2;", "Lcom/avito/android/advert/item/blocks/items_factories/AdvertDetailsHotelDescriptionItemFactory;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.c2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27938c2 implements AdvertDetailsHotelDescriptionItemFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73930a;

    /* compiled from: AdvertDetailsHotelDescriptionItemFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.blocks.items_factories.c2$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AdvertDetailsHotelDescriptionItemFactory.HotelDescriptionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsHotelDescriptionItemFactory.HotelDescriptionType hotelDescriptionType = AdvertDetailsHotelDescriptionItemFactory.HotelDescriptionType.f73701b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C27938c2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73930a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory
    @Y61.l
    public final AdvertHotelDescriptionItem a(@Y61.l AdvertHotelDescription advertHotelDescription, @Y61.k AdvertDetailsHotelDescriptionItemFactory.HotelDescriptionType hotelDescriptionType) {
        AdvertDetailsItem advertDetailsItem;
        if (advertHotelDescription == null) {
            return null;
        }
        int iOrdinal = hotelDescriptionType.ordinal();
        if (iOrdinal == 0) {
            advertDetailsItem = AdvertDetailsItem.f82449G3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            advertDetailsItem = AdvertDetailsItem.f82454H3;
        }
        return new AdvertHotelDescriptionItem(advertDetailsItem.ordinal(), null, null, null, this.f73930a.a(), advertHotelDescription.getTitle(), advertHotelDescription.getDescription(), null, 142, null);
    }
}
