package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHoursSchedulePeriodConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/q;", "Lcom/avito/android/service_booking_settings/domain/converters/p;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f277888a;

    @Inject
    public q(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f277888a = interfaceC35863o4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_settings.domain.converters.p
    @Y61.l
    public final SchedulePeriod a(@Y61.l ServiceBookingWorkHours.ServiceBookingSchedulePeriod serviceBookingSchedulePeriod) {
        SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem = null;
        if (serviceBookingSchedulePeriod == null) {
            return null;
        }
        List<ServiceBookingWorkHours.ServiceBookingSchedulePeriod.ScheduleOptions> listD = serviceBookingSchedulePeriod.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        for (ServiceBookingWorkHours.ServiceBookingSchedulePeriod.ScheduleOptions scheduleOptions : listD) {
            arrayList.add(new SchedulePeriod.ScheduleOptionsItem(scheduleOptions.getId(), scheduleOptions.getTitle(), scheduleOptions.getLabel()));
        }
        String strA = this.f277888a.a();
        String placeholder = serviceBookingSchedulePeriod.getPlaceholder();
        String title = serviceBookingSchedulePeriod.getTitle();
        String value = serviceBookingSchedulePeriod.getValue();
        if (value != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((SchedulePeriod.ScheduleOptionsItem) next).f278062b, value)) {
                    scheduleOptionsItem = next;
                    break;
                }
            }
            scheduleOptionsItem = scheduleOptionsItem;
        }
        return new SchedulePeriod(strA, arrayList, placeholder, title, scheduleOptionsItem, serviceBookingSchedulePeriod.getFromPage(), false, 64, null);
    }
}
