package com.avito.android.service_booking.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking.analytic_events.SBSpecialistScreenOpenEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import qt0.j;

/* compiled from: SbSpecialistStepEventPageResolver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/b;", "Lcom/avito/android/service_booking/mvi/domain/a;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking.mvi.domain.a
    @k
    public final SBSpecialistScreenOpenEvent.FromPageType a(@l List<? extends com.avito.conveyor_item.a> list) {
        int i12 = 0;
        if (list != null) {
            List<? extends com.avito.conveyor_item.a> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if ((((com.avito.conveyor_item.a) it.next()) instanceof j) && (i12 = i12 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
        }
        return i12 == 1 ? SBSpecialistScreenOpenEvent.FromPageType.f274149d : i12 > 1 ? SBSpecialistScreenOpenEvent.FromPageType.f274148c : SBSpecialistScreenOpenEvent.FromPageType.f274150e;
    }
}
