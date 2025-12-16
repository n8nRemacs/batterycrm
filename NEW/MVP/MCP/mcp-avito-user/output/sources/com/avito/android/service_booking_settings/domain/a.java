package com.avito.android.service_booking_settings.domain;

import Ut0.C15567b;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingSettingsMviInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/a;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @k
    InterfaceC43160i<ServiceBookingWorkHoursInternalAction> a(@l String str);

    @k
    InterfaceC43160i<ServiceBookingWorkHoursInternalAction> b(@k List<C15567b> list, @l String str, @l String str2, @l ServiceBookingWorkHours.WorkHoursLink workHoursLink);
}
