package com.avito.android.hotel_available_rooms.konveyor.converters;

import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelItem;
import com.avito.android.hotel_available_rooms.domain.models.HotelRoom;
import com.avito.android.hotel_available_rooms.domain.models.PromoWidget;
import com.avito.android.hotel_available_rooms.konveyor.gap.HotelRoomGapItem;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelListItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/converters/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/converters/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v f162879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f162880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f162881c;

    @Inject
    public b(@Y61.k v vVar, @Y61.k i iVar, @Y61.k e eVar) {
        this.f162879a = vVar;
        this.f162880b = iVar;
        this.f162881c = eVar;
    }

    public static HotelRoomGapItem b(int i12) {
        return new HotelRoomGapItem(AK.c.g(i12, "hotel_room_gap_item"), i12);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.converters.a
    @Y61.k
    public final List<TV0.a> a(@Y61.k HotelAvailableRoomsState hotelAvailableRoomsState) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        HotelAvailableRoomsData hotelAvailableRoomsData = hotelAvailableRoomsState.f163123d;
        if (hotelAvailableRoomsData != null && (arrayList = hotelAvailableRoomsData.f162772d) != null) {
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            int i13 = 0;
            for (Object obj : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                HotelItem hotelItem = (HotelItem) obj;
                ArrayList arrayList4 = new ArrayList();
                if (hotelItem instanceof HotelRoom) {
                    if (i13 != 0) {
                        arrayList4.add(b(40));
                    }
                    arrayList4.addAll(this.f162879a.a(hotelAvailableRoomsState.f163127h, hotelAvailableRoomsState.f163128i, (HotelRoom) hotelItem));
                } else if (hotelItem instanceof PromoWidget) {
                    if (i13 != 0) {
                        arrayList4.add(b(36));
                    }
                    arrayList4.add(this.f162880b.a((PromoWidget) hotelItem));
                }
                C42745f0.h(arrayList4, arrayList3);
                i13 = i14;
            }
            ArrayList arrayList5 = new ArrayList();
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((HotelItem) it.next()) instanceof HotelRoom) && (i12 = i12 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            if (i12 == 0) {
                arrayList5.add(b(16));
                arrayList5.addAll(this.f162881c.create());
                arrayList5.add(b(34));
                arrayList5.addAll(arrayList3);
                arrayList5.add(b(14));
            } else {
                arrayList5.add(b(14));
                arrayList5.addAll(arrayList3);
                arrayList5.add(b(14));
            }
            arrayList2 = arrayList5;
        }
        return arrayList2 == null ? C42784z0.f406748b : arrayList2;
    }
}
