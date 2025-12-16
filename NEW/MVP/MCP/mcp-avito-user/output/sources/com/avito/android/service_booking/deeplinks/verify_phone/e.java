package com.avito.android.service_booking.deeplinks.verify_phone;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServiceBookingVerifyPhoneLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/e;", "LKu/a;", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<ServiceBookingVerifyPhoneLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ServiceBookingVerifyPhoneLink(i.p(uri, "advertId"), uri.getQueryParameter("mcId"), uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID));
    }
}
