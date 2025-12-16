package com.avito.android.service_booking_schedule_repetition_impl.link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ServiceBookingScheduleRepetitionLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/link/d;", "LKu/a;", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC14350a<ServiceBookingScheduleRepetitionLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ArrayList arrayList;
        long jM2 = i.m(uri, SelectionType.TYPE_DAY);
        boolean z12 = Boolean.parseBoolean(i.p(uri, "isActive"));
        int iL2 = i.l(uri, "workHoursFrom");
        int iL3 = i.l(uri, "workHoursTo");
        ArrayList arrayList2 = new ArrayList();
        String queryParameter = uri.getQueryParameter("breaks[0][from]");
        Integer numValueOf = queryParameter != null ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
        int i12 = 0;
        while (true) {
            if (numValueOf == null) {
                arrayList = arrayList2;
                break;
            }
            String queryParameter2 = uri.getQueryParameter("breaks[" + i12 + "][to]");
            if (queryParameter2 == null) {
                arrayList = null;
                break;
            }
            arrayList2.add(new ServiceBookingScheduleRepetitionLink.Break(numValueOf.intValue(), Integer.parseInt(queryParameter2)));
            i12++;
            String queryParameter3 = uri.getQueryParameter("breaks[" + i12 + "][from]");
            numValueOf = queryParameter3 != null ? Integer.valueOf(Integer.parseInt(queryParameter3)) : null;
        }
        return new ServiceBookingScheduleRepetitionLink(jM2, z12, iL2, iL3, arrayList);
    }
}
