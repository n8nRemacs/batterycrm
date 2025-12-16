package com.avito.android.hotel_booking.domain;

import androidx.compose.runtime.C22026a;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.hotel.model.HotelBookingSelectItem;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HotelBookingCollectParamsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/domain/b;", "Lcom/avito/android/hotel_booking/domain/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.hotel_booking.domain.a
    @Y61.k
    public final LinkedHashMap a(@Y61.k List list) {
        String string;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof HotelBookingParameter) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HotelBookingParameter hotelBookingParameter = (HotelBookingParameter) it.next();
            String string2 = null;
            Map mapSingletonMap = null;
            string2 = null;
            if (hotelBookingParameter instanceof HotelBookingSelectItem) {
                HotelBookingSelectItem hotelBookingSelectItem = (HotelBookingSelectItem) hotelBookingParameter;
                HotelBookingSelectItem.Value value = hotelBookingSelectItem.getValue();
                if (value != null) {
                    List<Map<String, String>> list2 = value.f162629b;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                    int i12 = 0;
                    for (Object obj2 : list2) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        LinkedHashMap linkedHashMapB = C35755b0.b((Map) obj2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(linkedHashMapB.size()));
                        for (Map.Entry entry : linkedHashMapB.entrySet()) {
                            String str = (String) entry.getKey();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(hotelBookingSelectItem.getId());
                            sb2.append('[');
                            sb2.append(i12);
                            sb2.append("][");
                            linkedHashMap.put(C22026a.c(sb2, str, ']'), entry.getValue());
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            Object key = entry2.getKey();
                            String str2 = (String) entry2.getValue();
                            linkedHashMap2.put(key, str2 != null ? C43066x.A0(str2).toString() : null);
                        }
                        arrayList3.add(linkedHashMap2);
                        i12 = i13;
                    }
                    mapSingletonMap = C35755b0.d(arrayList3);
                }
                if (mapSingletonMap == null) {
                    mapSingletonMap = P0.c();
                }
            } else {
                String id2 = hotelBookingParameter.getId();
                Object value2 = hotelBookingParameter.getValue();
                if (value2 != null && (string = value2.toString()) != null) {
                    string2 = C43066x.A0(string).toString();
                }
                mapSingletonMap = Collections.singletonMap(id2, string2);
            }
            C42745f0.h(P0.o(mapSingletonMap), arrayList2);
        }
        return C35755b0.c(C35755b0.b(P0.p(arrayList2)));
    }
}
