package com.avito.android.service_booking_settings.domain.converters;

import Ut0.C15567b;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursDayConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/h;", "Lcom/avito/android/service_booking_settings/domain/converters/g;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.service_booking_settings.domain.converters.g
    @Y61.k
    public final C15567b a(@Y61.k ServiceBookingWorkHours.ServiceBookingDay serviceBookingDay) {
        return new C15567b(String.valueOf(serviceBookingDay.getId()), serviceBookingDay.getId(), serviceBookingDay.getTitle(), serviceBookingDay.getEnabled(), org.threeten.bp.g.z(serviceBookingDay.getDayFromSeconds()), org.threeten.bp.g.z(serviceBookingDay.getDayToSeconds()), false, 64, null);
    }
}
