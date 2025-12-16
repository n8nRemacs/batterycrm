package com.avito.android.hotel_booking.domain;

import Ju.InterfaceC14249c;
import com.avito.android.hotel.model.HotelBookingSelectItem;
import com.avito.android.hotel_booking.Group;
import com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink;
import com.avito.android.hotel_booking.HotelBookingSelectRadioDeeplink;
import com.avito.android.hotel_booking.HotelBookingSelectSingleValueDeeplink;
import com.avito.android.hotel_booking.Input;
import com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HotelBookingExtractValueDeeplinkUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/domain/e;", "Lcom/avito/android/hotel_booking/domain/d;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.hotel_booking.domain.d
    @Y61.l
    public final Object a(@Y61.k InterfaceC14249c interfaceC14249c) {
        LinkedHashMap linkedHashMapB;
        if (interfaceC14249c instanceof HotelBookingSelectSingleValueDeeplink.b.a) {
            return ((HotelBookingSelectSingleValueDeeplink.b.a) interfaceC14249c).f163261b.getId();
        }
        if (interfaceC14249c instanceof HotelBookingSelectRadioDeeplink.b.a) {
            return ((HotelBookingSelectRadioDeeplink.b.a) interfaceC14249c).f163258b.getId();
        }
        if (interfaceC14249c instanceof BookingFormPromoCodeDialogDeeplink.b.c) {
            return ((BookingFormPromoCodeDialogDeeplink.b.c) interfaceC14249c).f282248b;
        }
        if ((interfaceC14249c instanceof BookingFormPromoCodeDialogDeeplink.b.C8423b) || !(interfaceC14249c instanceof HotelBookingEnterDataDeeplink.b.a)) {
            return null;
        }
        ArrayList arrayList = ((HotelBookingEnterDataDeeplink.b.a) interfaceC14249c).f163248b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<Input> listC = ((Group) it.next()).c();
            if (listC != null) {
                List<Input> list = listC;
                int iF2 = P0.f(C42745f0.q(list, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (Input input : list) {
                    String id2 = input.getId();
                    String text = input.getText();
                    if (text == null) {
                        text = "";
                    }
                    linkedHashMap.put(id2, C43066x.A0(text).toString());
                }
                linkedHashMapB = C35755b0.b(linkedHashMap);
            } else {
                linkedHashMapB = null;
            }
            if (linkedHashMapB != null) {
                arrayList2.add(linkedHashMapB);
            }
        }
        return new HotelBookingSelectItem.Value(arrayList2);
    }
}
