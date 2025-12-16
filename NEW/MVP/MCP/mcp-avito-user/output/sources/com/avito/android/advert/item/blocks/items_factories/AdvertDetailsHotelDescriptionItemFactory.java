package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.hotel.hotel_description.AdvertHotelDescriptionItem;
import com.avito.android.hotel.model.AdvertHotelDescription;
import kotlin.Metadata;

/* compiled from: AdvertDetailsHotelDescriptionItemFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/AdvertDetailsHotelDescriptionItemFactory;", "", "HotelDescriptionType", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertDetailsHotelDescriptionItemFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsHotelDescriptionItemFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/AdvertDetailsHotelDescriptionItemFactory$HotelDescriptionType;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HotelDescriptionType {

        /* renamed from: b, reason: collision with root package name */
        public static final HotelDescriptionType f73701b;

        /* renamed from: c, reason: collision with root package name */
        public static final HotelDescriptionType f73702c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ HotelDescriptionType[] f73703d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f73704e;

        static {
            HotelDescriptionType hotelDescriptionType = new HotelDescriptionType("CHECKIN_RULES_DESCRIPTION", 0);
            f73701b = hotelDescriptionType;
            HotelDescriptionType hotelDescriptionType2 = new HotelDescriptionType("GUEST_INFO_DESCRIPTION", 1);
            f73702c = hotelDescriptionType2;
            HotelDescriptionType[] hotelDescriptionTypeArr = {hotelDescriptionType, hotelDescriptionType2};
            f73703d = hotelDescriptionTypeArr;
            f73704e = kotlin.enums.c.a(hotelDescriptionTypeArr);
        }

        public HotelDescriptionType() {
            throw null;
        }

        public static HotelDescriptionType valueOf(String str) {
            return (HotelDescriptionType) Enum.valueOf(HotelDescriptionType.class, str);
        }

        public static HotelDescriptionType[] values() {
            return (HotelDescriptionType[]) f73703d.clone();
        }
    }

    @Y61.l
    AdvertHotelDescriptionItem a(@Y61.l AdvertHotelDescription advertHotelDescription, @Y61.k HotelDescriptionType hotelDescriptionType);
}
