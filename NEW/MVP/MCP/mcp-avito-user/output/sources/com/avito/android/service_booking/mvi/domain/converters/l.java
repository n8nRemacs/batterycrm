package com.avito.android.service_booking.mvi.domain.converters;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import qt0.C47440d;

/* compiled from: ServiceBookingTimeslotsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/converters/l;", "Lcom/avito/android/service_booking/mvi/domain/converters/k;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {
    @Inject
    public l() {
    }

    @Override // com.avito.android.service_booking.mvi.domain.converters.k
    @Y61.k
    public final Q<C47440d.a, C47440d.c> a(@Y61.k C47440d.a aVar, @Y61.k List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (String str : list2) {
            arrayList.add(new C47440d.a(str, aVar.f429416c, com.avito.android.service_booking_common.b.b(str), false, true));
        }
        return new Q<>(aVar, new C47440d.c.C12339c(arrayList));
    }
}
