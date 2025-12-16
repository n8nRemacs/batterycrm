package com.avito.android.service_booking.mvi.domain.converters;

import com.avito.android.service_booking_common.n;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ys0.C50290a;

/* compiled from: ServiceBookingButtonTextConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/converters/f;", "Lcom/avito/android/service_booking/mvi/domain/converters/e;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f274354a;

    @Inject
    public f(@Y61.k n nVar) {
        this.f274354a = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking.mvi.domain.converters.e
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k ArrayList arrayList) {
        n nVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nVar = this.f274354a;
            if (!zHasNext) {
                break;
            }
            C50290a c50290a = (C50290a) it.next();
            BookingFormResponseV3SuccessParamsItem bookingFormResponseV3SuccessParamsItem = c50290a.f443550d;
            boolean z12 = bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3;
            T t12 = c50290a.f443549c;
            String strA = null;
            if (z12) {
                List list = t12 instanceof List ? (List) t12 : null;
                strA = nVar.b(list != null ? Integer.valueOf(list.size()) : null);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDateV3) {
                String str2 = t12 instanceof String ? (String) t12 : null;
                strA = nVar.a(str2 != null ? com.avito.android.service_booking_common.b.b(str2) : null);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3) {
                String str3 = t12 instanceof String ? (String) t12 : null;
                strA = nVar.a(str3 != null ? com.avito.android.service_booking_common.b.b(str3) : null);
            }
            if (strA != null) {
                arrayList2.add(strA);
            }
        }
        return arrayList2.isEmpty() ? str : nVar.e(C42745f0.O(arrayList2, ", ", null, null, null, 62));
    }
}
