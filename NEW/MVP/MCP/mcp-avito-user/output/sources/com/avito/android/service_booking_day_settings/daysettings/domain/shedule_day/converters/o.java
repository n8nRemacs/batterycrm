package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SaveScheduleInfoConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/o;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/converters/n;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.data.preferences.a f276814a;

    @Inject
    public o(@Y61.k com.avito.android.service_booking.data.preferences.a aVar) {
        this.f276814a = aVar;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.n
    @Y61.l
    public final DaySettingsState.SaveScheduleInfo a(@Y61.l DayScheduleResult.ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo) {
        if (serviceBookingSaveScheduleInfo == null || this.f276814a.b()) {
            return null;
        }
        return new DaySettingsState.SaveScheduleInfo(serviceBookingSaveScheduleInfo.getTitle(), serviceBookingSaveScheduleInfo.getDescription(), q.a(serviceBookingSaveScheduleInfo.getAcceptButton()), q.a(serviceBookingSaveScheduleInfo.getCancelButton()), serviceBookingSaveScheduleInfo.getFromPage());
    }
}
