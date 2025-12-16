package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.SaveDayInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import yt0.InterfaceC50301b;

/* compiled from: DaySettingsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lyt0/b;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements t<DaySettingsInternalAction, InterfaceC50301b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50301b b(DaySettingsInternalAction daySettingsInternalAction) {
        DaySettingsInternalAction daySettingsInternalAction2 = daySettingsInternalAction;
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.Finish) {
            DaySettingsInternalAction.Finish finish = (DaySettingsInternalAction.Finish) daySettingsInternalAction2;
            return new InterfaceC50301b.a(finish.f276932b, finish.f276933c);
        }
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.OpenDeepLink) {
            return new InterfaceC50301b.e(((DaySettingsInternalAction.OpenDeepLink) daySettingsInternalAction2).f276954b);
        }
        if (daySettingsInternalAction2 instanceof SaveDayInternalAction.SaveShowSuccess) {
            return new InterfaceC50301b.i(((SaveDayInternalAction.SaveShowSuccess) daySettingsInternalAction2).f277034b);
        }
        if (daySettingsInternalAction2 instanceof SaveDayInternalAction.SaveShowError) {
            return new InterfaceC50301b.h(((SaveDayInternalAction.SaveShowError) daySettingsInternalAction2).f277033c);
        }
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.OnClickTimeFrom) {
            DaySettingsInternalAction.OnClickTimeFrom onClickTimeFrom = (DaySettingsInternalAction.OnClickTimeFrom) daySettingsInternalAction2;
            return new InterfaceC50301b.f(onClickTimeFrom.f276938b, onClickTimeFrom.f276939c);
        }
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.OnClickTimeTo) {
            DaySettingsInternalAction.OnClickTimeTo onClickTimeTo = (DaySettingsInternalAction.OnClickTimeTo) daySettingsInternalAction2;
            return new InterfaceC50301b.g(onClickTimeTo.f276940b, onClickTimeTo.f276941c);
        }
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.OnOpenAvitoUrl) {
            ((DaySettingsInternalAction.OnOpenAvitoUrl) daySettingsInternalAction2).getClass();
            return new InterfaceC50301b.C12930b();
        }
        if (daySettingsInternalAction2 instanceof DaySettingsInternalAction.OpenBreakStartTimePicker) {
            DaySettingsInternalAction.OpenBreakStartTimePicker openBreakStartTimePicker = (DaySettingsInternalAction.OpenBreakStartTimePicker) daySettingsInternalAction2;
            return new InterfaceC50301b.d(openBreakStartTimePicker.f276951b, openBreakStartTimePicker.f276952c, openBreakStartTimePicker.f276953d);
        }
        if (!(daySettingsInternalAction2 instanceof DaySettingsInternalAction.OpenBreakEndTimePicker)) {
            return null;
        }
        DaySettingsInternalAction.OpenBreakEndTimePicker openBreakEndTimePicker = (DaySettingsInternalAction.OpenBreakEndTimePicker) daySettingsInternalAction2;
        return new InterfaceC50301b.c(openBreakEndTimePicker.f276948b, openBreakEndTimePicker.f276949c, openBreakEndTimePicker.f276950d);
    }
}
