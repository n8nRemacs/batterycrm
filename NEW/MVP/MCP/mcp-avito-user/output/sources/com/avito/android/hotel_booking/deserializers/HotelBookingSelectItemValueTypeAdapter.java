package com.avito.android.hotel_booking.deserializers;

import com.avito.android.hotel.model.HotelBookingSelectItem;
import com.avito.android.remote.C34328m0;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingSelectItemValueTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/deserializers/HotelBookingSelectItemValueTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelBookingSelectItemValueTypeAdapter implements h<HotelBookingSelectItem.Value> {
    @Override // com.google.gson.h
    public final HotelBookingSelectItem.Value deserialize(i iVar, Type type, g gVar) {
        f fVarC = C34328m0.c(iVar);
        if (fVarC == null) {
            return null;
        }
        ArrayList arrayList = fVarC.f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gVar.b((i) it.next(), Map.class));
        }
        return new HotelBookingSelectItem.Value(arrayList2);
    }
}
