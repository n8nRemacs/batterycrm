package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SaveDayScheduleUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/use_case/d;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {
    @k
    InterfaceC43160i<DaySettingsInternalAction> a(@k List<Long> list, boolean z12, int i12, int i13, @l List<SettingsBreakItem> list2, @k String str);
}
