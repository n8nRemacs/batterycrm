package com.avito.android.service_booking.mvi.domain.converters;

import com.avito.android.arch.mvi.utils.c;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ys0.C50290a;

/* compiled from: ServiceBookingBlockWithDecoratorConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/converters/b;", "Lcom/avito/android/service_booking/mvi/domain/converters/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking.mvi.domain.converters.a
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BookingFormResponseV3SuccessParamsItem bookingFormResponseV3SuccessParamsItem = (BookingFormResponseV3SuccessParamsItem) it.next();
            com.avito.android.arch.mvi.utils.c bVar = null;
            if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3) {
                c.a aVar = com.avito.android.arch.mvi.utils.c.f92026a;
                BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3 bookingParamCheckPriceListV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3) bookingFormResponseV3SuccessParamsItem;
                C50290a c50290a = new C50290a(bookingParamCheckPriceListV3.getId().f277492b, null, bookingParamCheckPriceListV3.c(), bookingFormResponseV3SuccessParamsItem);
                aVar.getClass();
                bVar = new c.C2712c(c50290a);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3) {
                c.a aVar2 = com.avito.android.arch.mvi.utils.c.f92026a;
                BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3 bookingParamCommentV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3) bookingFormResponseV3SuccessParamsItem;
                String str = bookingParamCommentV3.getId().f277498b;
                Boolean optional = bookingParamCommentV3.getOptional();
                C50290a c50290a2 = new C50290a(str, Boolean.valueOf(optional != null ? optional.booleanValue() : true), null, bookingFormResponseV3SuccessParamsItem);
                aVar2.getClass();
                bVar = new c.C2712c(c50290a2);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDateV3) {
                c.a aVar3 = com.avito.android.arch.mvi.utils.c.f92026a;
                BookingFormResponseV3SuccessParamsItem.BookingParamDateV3 bookingParamDateV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamDateV3) bookingFormResponseV3SuccessParamsItem;
                C50290a c50290a3 = new C50290a(bookingParamDateV3.getId().f277504b, null, bookingParamDateV3.getValue(), bookingFormResponseV3SuccessParamsItem);
                aVar3.getClass();
                bVar = new c.C2712c(c50290a3);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3) {
                c.a aVar4 = com.avito.android.arch.mvi.utils.c.f92026a;
                C50290a c50290a4 = new C50290a(((BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3) bookingFormResponseV3SuccessParamsItem).getId().f277510b, null, null, bookingFormResponseV3SuccessParamsItem);
                aVar4.getClass();
                bVar = new c.C2712c(c50290a4);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3) {
                c.a aVar5 = com.avito.android.arch.mvi.utils.c.f92026a;
                BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3 bookingParamInputTextV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3) bookingFormResponseV3SuccessParamsItem;
                C50290a c50290a5 = new C50290a(bookingParamInputTextV3.getId().f277516b, bookingParamInputTextV3.getOptional(), bookingParamInputTextV3.getValue(), bookingFormResponseV3SuccessParamsItem);
                aVar5.getClass();
                bVar = new c.C2712c(c50290a5);
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) {
                c.a aVar6 = com.avito.android.arch.mvi.utils.c.f92026a;
                C50290a c50290a6 = new C50290a(((BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) bookingFormResponseV3SuccessParamsItem).getId().f277526b, null, null, bookingFormResponseV3SuccessParamsItem);
                aVar6.getClass();
                bVar = new c.C2712c(c50290a6);
            } else if ((bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamOfferV3) || (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamTextV3) || (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingImagesV3) || (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamPriceListV3)) {
                com.avito.android.arch.mvi.utils.c.f92026a.getClass();
                bVar = new c.b(bookingFormResponseV3SuccessParamsItem);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
