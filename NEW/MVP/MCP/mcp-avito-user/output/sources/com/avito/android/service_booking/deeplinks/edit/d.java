package com.avito.android.service_booking.deeplinks.edit;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.service_booking.BookingFlowSource;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingEditLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/d;", "LKu/a;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC14350a<ServiceBookingEditLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        BookingFlowSource bookingFlowSource;
        String queryParameter = uri.getQueryParameter("advertId");
        String strP = i.p(uri, "stepId");
        String strP2 = i.p(uri, "bookingId");
        String queryParameter2 = uri.getQueryParameter("mcId");
        String queryParameter3 = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        if (queryParameter3 != null) {
            BookingFlowSource.f274125c.getClass();
            BookingFlowSource bookingFlowSource2 = BookingFlowSource.f274126d;
            if (!L.f(queryParameter3, "chat")) {
                bookingFlowSource2 = BookingFlowSource.f274127e;
            }
            bookingFlowSource = bookingFlowSource2;
        } else {
            bookingFlowSource = null;
        }
        return new ServiceBookingEditLink(queryParameter, strP, strP2, queryParameter2, bookingFlowSource);
    }
}
