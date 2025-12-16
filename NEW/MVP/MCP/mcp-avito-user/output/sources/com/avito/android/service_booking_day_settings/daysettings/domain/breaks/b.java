package com.avito.android.service_booking_day_settings.daysettings.domain.breaks;

import Y61.k;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BreakFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/a;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f276761a;

    @Inject
    public b(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f276761a = interfaceC35863o4;
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.breaks.a
    @k
    public final SettingsBreakItem a() {
        return new SettingsBreakItem(this.f276761a.a(), new TimeSelect(null, false), new TimeSelect(null, false), false, false, null, 48, null);
    }
}
