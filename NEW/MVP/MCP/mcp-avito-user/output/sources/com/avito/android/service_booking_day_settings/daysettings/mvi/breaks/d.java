package com.avito.android.service_booking_day_settings.daysettings.mvi.breaks;

import Y61.k;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.Metadata;

/* compiled from: BreakStartTimeChangedUpdateStateUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/breaks/d;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {
    @k
    DaySettingsState a(@k DaySettingsInternalAction.BreakStartTimeChanged breakStartTimeChanged, @k DaySettingsState daySettingsState);
}
