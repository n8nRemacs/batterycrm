package com.avito.android.service_booking_settings.work_hours.item.schedule_period;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceBookingSchedulePeriodItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule_period/h;", "LTV0/e;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h extends TV0.e {

    /* compiled from: ServiceBookingSchedulePeriodItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void QE(@k Y41.a<G0> aVar);

    void iq(@l SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem);

    void setEnabled(boolean z12);

    void setHint(@l String str);

    void setInputClickListener(@k Y41.a<G0> aVar);

    void setTitle(@l String str);
}
