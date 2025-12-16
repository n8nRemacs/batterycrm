package com.avito.android.service_booking_day_settings.daysettings.adapter;

import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SettingBreakItems.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-day-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @Y61.k
    public static final SettingsBreakItem a(@Y61.k SettingsBreakItem settingsBreakItem, @Y61.k DaySettingsState.BreaksInfo breaksInfo) {
        return SettingsBreakItem.a(settingsBreakItem, new TimeSelect(settingsBreakItem.f276724c.f276729b, true), new TimeSelect(settingsBreakItem.f276725d.f276729b, true), new BreakDescription(com.avito.android.printable_text.b.f(breaksInfo.f276988f.f276979c), breaksInfo.f276989g, false), 25);
    }
}
