package com.avito.android.service_booking_settings.domain.converters;

import Ut0.C15567b;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingDayStateWorkHoursConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/b;", "Lcom/avito/android/service_booking_settings/domain/converters/a;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking_settings.domain.converters.a
    @Y61.k
    public final ServiceBookingWorkHours.ServiceBookingDay a(@Y61.k C15567b c15567b) {
        return new ServiceBookingWorkHours.ServiceBookingDay(c15567b.f16717c, c15567b.f16718d, c15567b.f16719e, c15567b.f16720f.J(), c15567b.f16721g.J());
    }
}
