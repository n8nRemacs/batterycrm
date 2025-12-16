package com.avito.android.hotel_booking.deserializers;

import Y61.k;
import com.avito.android.hotel.model.HotelBookingCheckBoxItem;
import com.avito.android.hotel.model.HotelBookingDottedTextItem;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingInputItem;
import com.avito.android.hotel.model.HotelBookingInstallmentsItem;
import com.avito.android.hotel.model.HotelBookingOfferItem;
import com.avito.android.hotel.model.HotelBookingRadioGroupItem;
import com.avito.android.hotel.model.HotelBookingSelectItem;
import com.avito.android.hotel.model.HotelBookingSpacingItem;
import com.avito.android.hotel.model.HotelBookingTextItem;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: HotelBookingItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/deserializers/HotelBookingItemTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelBookingItemTypeAdapter implements h<HotelBookingFormItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f163335a = P0.g(new Q("spacing", HotelBookingSpacingItem.class), new Q("text", HotelBookingTextItem.class), new Q("dottedText", HotelBookingDottedTextItem.class), new Q("checkbox", HotelBookingCheckBoxItem.class), new Q("input", HotelBookingInputItem.class), new Q("select", HotelBookingSelectItem.class), new Q("booking", HotelBookingOfferItem.class), new Q(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR, HotelBookingInstallmentsItem.class), new Q("radioGroup", HotelBookingRadioGroupItem.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final HotelBookingFormItem deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = (Type) this.f163335a.get(strS);
        if (type2 == null) {
            return null;
        }
        i iVarD2 = kVarI.D("content");
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        if (kVarI2 == null) {
            return null;
        }
        return (HotelBookingFormItem) gVar.b(kVarI2, type2);
    }
}
