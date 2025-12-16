package com.avito.android.deep_linking.links;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StrSoftBookingDeepLink.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/I;", "LKu/a;", "Lcom/avito/android/deep_linking/links/StrSoftBookingDeepLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I extends AbstractC14350a<StrSoftBookingDeepLink> {
    @Inject
    public I() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        Integer numY0;
        Integer numY02;
        String strO = Ku.i.o(uri, "itemId");
        String strO2 = Ku.i.o(uri, SearchParamsConverterKt.SOURCE);
        String queryParameter = uri.getQueryParameter("checkIn");
        String queryParameter2 = uri.getQueryParameter("checkOut");
        String queryParameter3 = uri.getQueryParameter("guestsCount");
        Integer num = (queryParameter3 == null || (numY02 = C43066x.y0(queryParameter3)) == null || numY02.intValue() <= 0) ? null : numY02;
        String queryParameter4 = uri.getQueryParameter("maxGuestsAllowed");
        Integer num2 = (queryParameter4 == null || (numY0 = C43066x.y0(queryParameter4)) == null || numY0.intValue() <= 0) ? null : numY0;
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("showCalendar"));
        String queryParameter5 = uri.getQueryParameter("guestsDetailed");
        String queryParameter6 = uri.getQueryParameter("withChildren");
        Boolean boolV0 = queryParameter6 != null ? C43066x.v0(queryParameter6) : null;
        String queryParameter7 = uri.getQueryParameter("x");
        String queryParameter8 = uri.getQueryParameter("noRefund");
        return new StrSoftBookingDeepLink(strO, strO2, queryParameter, queryParameter2, num, num2, z12, queryParameter5, boolV0, queryParameter7, queryParameter8 != null ? C43066x.v0(queryParameter8) : null, uri.getQueryParameter("paymentType"), uri.getQueryParameter("fromPage"));
    }
}
