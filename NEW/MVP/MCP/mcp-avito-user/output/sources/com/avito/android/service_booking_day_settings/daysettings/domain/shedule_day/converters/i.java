package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DayScheduleDayInfoConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/i;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/h;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.h
    @Y61.k
    public final DaySettingsState.DayInfo a(@Y61.k DayScheduleResult.c cVar) {
        return new DaySettingsState.DayInfo(cVar.getTitle(), cVar.getActive(), cVar.getTimestamp());
    }
}
