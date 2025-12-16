package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.R;
import com.avito.android.hotel_available_rooms.konveyor.gap.HotelRoomGapItem;
import com.avito.android.hotel_available_rooms.konveyor.text.HotelRoomTextItem;
import com.avito.android.hotel_available_rooms.konveyor.text.TextData;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelOffersNotFoundItemBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/e;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.e
    @Y61.k
    public final ArrayList create() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HotelRoomTextItem("OFFERS_NOT_FOUND_TITLE_ID", new TextData.SimpleTextData(com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_no_data_title, new Serializable[0]), R.attr.textH25, null)));
        arrayList.add(new HotelRoomGapItem("hotel_room_gap_item6", 6));
        arrayList.add(new HotelRoomTextItem("OFFERS_NOT_FOUND_DESCRIPTION_ID", new TextData.SimpleTextData(com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_no_data_description, new Serializable[0]), R.attr.textM10, null)));
        return arrayList;
    }
}
