package com.avito.android.short_term_rent.bookingform.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.short_term_rent.deeplink.BookingFormDeepLink;
import com.avito.android.short_term_rent.utils.j;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/deeplink/e;", "LKu/a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<BookingFormDeepLink> {
    @Inject
    public e() {
    }

    public static Date s(Uri uri, String str) throws DeeplinkParsingError.WrongParameterValue {
        try {
            Date dateA = j.a(i.n(uri, str));
            if (dateA != null) {
                return dateA;
            }
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, null, null, 12, null);
        } catch (Exception e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, null, e12, 4, null);
        }
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        Object objE;
        GuestsDetailedDeepLinkData guestsDetailedDeepLinkData;
        String strN = i.n(uri, "itemId");
        Date dateS = s(uri, "checkIn");
        Date dateS2 = s(uri, "checkOut");
        String queryParameter = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        String queryParameter2 = uri.getQueryParameter("xHash");
        String queryParameter3 = uri.getQueryParameter("guestsDetailed");
        if (queryParameter3 != null) {
            try {
                Type type = new d().getType();
                objE = gson.e(queryParameter3, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            guestsDetailedDeepLinkData = (GuestsDetailedDeepLinkData) objE;
        } else {
            guestsDetailedDeepLinkData = null;
        }
        String queryParameter4 = uri.getQueryParameter("nonRefundableDiscountEnable");
        return new BookingFormDeepLink(queryParameter4 != null ? Boolean.valueOf(Boolean.parseBoolean(queryParameter4)) : null, guestsDetailedDeepLinkData != null ? guestsDetailedDeepLinkData.getWithPets() : null, guestsDetailedDeepLinkData != null ? guestsDetailedDeepLinkData.getTotalCount() : null, guestsDetailedDeepLinkData != null ? guestsDetailedDeepLinkData.getAdultsCount() : null, guestsDetailedDeepLinkData != null ? guestsDetailedDeepLinkData.getVersion() : null, strN, uri.getQueryParameter("paymentType"), queryParameter, queryParameter2, dateS, dateS2, guestsDetailedDeepLinkData != null ? guestsDetailedDeepLinkData.d() : null);
    }
}
