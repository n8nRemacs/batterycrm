package com.avito.android.service_booking_day_settings.daysettings.domain.breaks;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yt0.InterfaceC50300a;

/* compiled from: ServiceBookingBreaksInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/e;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e {
    @k
    d a(@k DaySettingsState daySettingsState, boolean z12);

    @l
    PrintableText b(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2, @k List<DaySettingsState.TimePeriod> list, @l String str);

    @k
    InterfaceC43160i<DaySettingsInternalAction> c(@k InterfaceC50300a.InterfaceC12928a interfaceC12928a, @k DaySettingsState daySettingsState);
}
