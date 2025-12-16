package com.avito.android.service_booking_settings.domain.converters;

import Ut0.g;
import com.avito.android.R;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.domain.d;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ServiceBookingWorkHoursSaveScheduleInfoConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/n;", "Lcom/avito/android/service_booking_settings/domain/converters/m;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ServiceBookingWorkHoursArgument f277884a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.data.preferences.a f277885b;

    @Inject
    public n(@Y61.k ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument, @Y61.k com.avito.android.service_booking_settings.data.preferences.a aVar) {
        this.f277884a = serviceBookingWorkHoursArgument;
        this.f277885b = aVar;
    }

    public static g.a b(ServiceBookingWorkHours.ServiceBookingSaveScheduleInfo.ActionButton actionButton) {
        int i12;
        String title = actionButton.getTitle();
        int i13 = d.a.f277892a[actionButton.getStyle().ordinal()];
        if (i13 == 1) {
            i12 = R.attr.buttonPrimaryLarge;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.buttonSecondaryLarge;
        }
        return new g.a(title, Integer.valueOf(i12));
    }

    @Override // com.avito.android.service_booking_settings.domain.converters.m
    @Y61.l
    public final Ut0.g a(@Y61.l ServiceBookingWorkHours.ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo) {
        if (serviceBookingSaveScheduleInfo == null || this.f277884a.f277894b || this.f277885b.f277782a.getBoolean("SAVE_DIALOG_SHOWN_KEY", false)) {
            return null;
        }
        return new Ut0.g(serviceBookingSaveScheduleInfo.getTitle(), serviceBookingSaveScheduleInfo.getDescription(), b(serviceBookingSaveScheduleInfo.getAcceptButton()), b(serviceBookingSaveScheduleInfo.getCancelButton()), serviceBookingSaveScheduleInfo.getFromPage(), false, 32, null);
    }
}
