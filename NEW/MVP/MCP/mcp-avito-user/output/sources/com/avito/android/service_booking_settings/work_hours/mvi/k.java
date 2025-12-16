package com.avito.android.service_booking_settings.work_hours.mvi;

import Ut0.i;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "LUt0/i;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements t<ServiceBookingWorkHoursInternalAction, Ut0.i> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ut0.i b(ServiceBookingWorkHoursInternalAction serviceBookingWorkHoursInternalAction) {
        ServiceBookingWorkHoursInternalAction serviceBookingWorkHoursInternalAction2 = serviceBookingWorkHoursInternalAction;
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.SaveSettingsError) {
            return new i.e(((ServiceBookingWorkHoursInternalAction.SaveSettingsError) serviceBookingWorkHoursInternalAction2).f278092b);
        }
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.SaveSettingsSuccess) {
            ServiceBookingWorkHours.WorkHoursLink workHoursLink = ((ServiceBookingWorkHoursInternalAction.SaveSettingsSuccess) serviceBookingWorkHoursInternalAction2).f278093b;
            return (workHoursLink != null ? workHoursLink.getUri() : null) != null ? new i.d(workHoursLink.getUri()) : new i.a();
        }
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnBackButtonClicked) {
            return new i.b(((ServiceBookingWorkHoursInternalAction.OnBackButtonClicked) serviceBookingWorkHoursInternalAction2).f278078b);
        }
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnTimeRestrictionClicked) {
            return new i.c(((ServiceBookingWorkHoursInternalAction.OnTimeRestrictionClicked) serviceBookingWorkHoursInternalAction2).f278089b);
        }
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnSchedulePeriodInputClicked) {
            return new i.c(((ServiceBookingWorkHoursInternalAction.OnSchedulePeriodInputClicked) serviceBookingWorkHoursInternalAction2).f278087b);
        }
        return null;
    }
}
