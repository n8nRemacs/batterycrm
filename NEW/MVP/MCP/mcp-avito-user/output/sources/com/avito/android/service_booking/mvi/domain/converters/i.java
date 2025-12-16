package com.avito.android.service_booking.mvi.domain.converters;

import com.avito.android.service_booking.mvi.step.mvi.entity.StepBlockProperty;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ys0.C50290a;

/* compiled from: ServiceBookingRequiredConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/converters/i;", "Lcom/avito/android/service_booking/mvi/domain/converters/h;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.service_booking.mvi.domain.converters.h
    @Y61.k
    public final Q a(@Y61.k ArrayList arrayList) {
        Boolean readOnly;
        int iF2 = P0.f(C42745f0.q(arrayList, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayList.iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            C50290a c50290a = (C50290a) it.next();
            BookingFormResponseV3SuccessParamsItem bookingFormResponseV3SuccessParamsItem = c50290a.f443550d;
            if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3 bookingParamSpecialistsV3 = bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3 ? (BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) bookingFormResponseV3SuccessParamsItem : null;
                zBooleanValue = (bookingParamSpecialistsV3 == null || (readOnly = bookingParamSpecialistsV3.getReadOnly()) == null) ? false : readOnly.booleanValue();
            }
            linkedHashMap.put(c50290a.f443547a, new StepBlockProperty(c50290a.f443548b, c50290a.f443549c == 0));
        }
        return new Q(new LinkedHashMap(linkedHashMap), Boolean.valueOf(zBooleanValue));
    }
}
