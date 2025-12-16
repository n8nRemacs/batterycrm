package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day;

import Y61.k;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yt0.InterfaceC50300a;

/* compiled from: InputsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/b;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/shedule_day/a;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a
    @k
    public final InterfaceC43160i<DaySettingsInternalAction> a(@k InterfaceC50300a interfaceC50300a) {
        return interfaceC50300a instanceof InterfaceC50300a.b ? new C43210w(new DaySettingsInternalAction.FromTimeChanged(((InterfaceC50300a.b) interfaceC50300a).f443570a)) : interfaceC50300a instanceof InterfaceC50300a.r ? new C43210w(new DaySettingsInternalAction.ToTimeChanged(((InterfaceC50300a.r) interfaceC50300a).f443584a)) : C43175k.w();
    }
}
