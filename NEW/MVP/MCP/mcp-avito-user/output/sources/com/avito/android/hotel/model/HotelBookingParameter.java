package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: HotelBookingFormItem.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003\u0082\u0001\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "T", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/HotelBookingCheckBoxItem;", "Lcom/avito/android/hotel/model/HotelBookingDottedTextItem;", "Lcom/avito/android/hotel/model/HotelBookingInputItem;", "Lcom/avito/android/hotel/model/HotelBookingInstallmentsItem;", "Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem;", "Lcom/avito/android/hotel/model/HotelBookingSelectItem;", "Lcom/avito/android/hotel/model/HotelBookingTextItem;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HotelBookingParameter<T> extends HotelBookingFormItem {

    /* compiled from: HotelBookingFormItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <T> boolean a(@k HotelBookingParameter<T> hotelBookingParameter) {
            Boolean boolO2 = hotelBookingParameter.O2();
            if (boolO2 != null) {
                return boolO2.booleanValue();
            }
            return false;
        }
    }

    boolean C5();

    @l
    Boolean O2();

    @l
    String getId();

    @l
    T getValue();
}
