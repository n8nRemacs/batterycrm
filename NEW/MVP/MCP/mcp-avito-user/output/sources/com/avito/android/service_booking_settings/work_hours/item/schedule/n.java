package com.avito.android.service_booking_settings.work_hours.item.schedule;

import Ut0.C15567b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHourPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/n;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.recycler.data_aware.a {
    @Inject
    public n() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207385b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207385b()) : null) || !(aVar instanceof C15567b) || !(aVar2 instanceof C15567b)) {
            return null;
        }
        C15567b c15567b = (C15567b) aVar2;
        return new m(c15567b.f16719e, c15567b.f16720f, c15567b.f16721g);
    }
}
