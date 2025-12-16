package com.avito.android.hotel_booking.deeplink.booking;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.hotel_booking.HotelBookingDeeplink;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HotelBookingDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/booking/d;", "LKu/a;", "Lcom/avito/android/hotel_booking/HotelBookingDeeplink;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends AbstractC14350a<HotelBookingDeeplink> {
    @Inject
    public d() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "code");
        String queryParameter = uri.getQueryParameter("adultGuests");
        ArrayList arrayList = null;
        Integer numY0 = queryParameter != null ? C43066x.y0(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("childAges");
        if (queryParameter2 != null) {
            List listF0 = C43066x.f0(queryParameter2, new String[]{","}, 0, 6);
            arrayList = new ArrayList();
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                Integer numY02 = C43066x.y0(C43066x.A0((String) it.next()).toString());
                if (numY02 != null) {
                    arrayList.add(numY02);
                }
            }
        }
        return new HotelBookingDeeplink(strN, numY0, arrayList, uri.getQueryParameter("itemId"), uri.getQueryParameter("roomId"), uri.getQueryParameter("checkIn"), uri.getQueryParameter("checkOut"));
    }
}
