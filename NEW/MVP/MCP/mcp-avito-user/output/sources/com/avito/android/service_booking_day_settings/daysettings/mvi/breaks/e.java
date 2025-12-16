package com.avito.android.service_booking_day_settings.daysettings.mvi.breaks;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BreakStartTimeChangedUpdateStateUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/breaks/e;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/breaks/d;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.d
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState a(@Y61.k com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction.BreakStartTimeChanged r17, @Y61.k com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.util.List<com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem> r2 = r0.f276929b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C42745f0.q(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r4 = r2.hasNext()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L45
            java.lang.Object r4 = r2.next()
            com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem r4 = (com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem) r4
            java.lang.String r7 = r4.f276723b
            java.lang.String r8 = r0.f276930c
            boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
            if (r7 == 0) goto L41
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r7 = r4.f276725d
            org.threeten.bp.g r8 = r7.f276729b
            if (r8 != 0) goto L37
            boolean r6 = r7.f276730c
        L37:
            com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect r6 = com.avito.android.service_booking_day_settings.daysettings.adapter.TimeSelect.a(r7, r6)
            r7 = 51
            com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem r4 = com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem.a(r4, r5, r6, r5, r7)
        L41:
            r3.add(r4)
            goto L17
        L45:
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreaksInfo r0 = r1.f276971h
            if (r0 == 0) goto L4c
            java.util.List<com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem> r2 = r0.f276992j
            goto L4d
        L4c:
            r2 = r5
        L4d:
            boolean r2 = r3.equals(r2)
            r4 = 1
            if (r2 == 0) goto L6b
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$DayScheduleInfo r2 = r1.f276966c
            if (r2 == 0) goto L5f
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$WorkHoursInfo r2 = r2.f277001f
            if (r2 == 0) goto L5f
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$TimePeriod r2 = r2.f277031c
            goto L60
        L5f:
            r2 = r5
        L60:
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$TimePeriod r7 = r1.f276970g
            boolean r2 = kotlin.jvm.internal.L.f(r7, r2)
            if (r2 != 0) goto L69
            goto L6b
        L69:
            r8 = r6
            goto L6c
        L6b:
            r8 = r4
        L6c:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L74
        L72:
            r14 = r4
            goto L8b
        L74:
            java.util.Iterator r2 = r3.iterator()
        L78:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L72
            java.lang.Object r7 = r2.next()
            com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem r7 = (com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem) r7
            boolean r7 = com.avito.android.service_booking_day_settings.daysettings.adapter.l.a(r7)
            if (r7 == 0) goto L78
            r14 = r6
        L8b:
            r12 = 0
            r13 = 0
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$ShowElements r7 = r1.f276968e
            r9 = 0
            r10 = 0
            r11 = 0
            r15 = 62
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$ShowElements r4 = com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState.ShowElements.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto La1
            r2 = 1019(0x3fb, float:1.428E-42)
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState$BreaksInfo r0 = com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState.BreaksInfo.a(r0, r3, r5, r5, r2)
            r5 = r0
        La1:
            com.avito.android.service_booking_utils.BookingSettingsStatus r0 = com.avito.android.service_booking_utils.BookingSettingsStatus.f278278d
            com.avito.android.service_booking_utils.BookingSettingsStatus r2 = r1.f276972i
            com.avito.android.service_booking_utils.BookingSettingsStatus r6 = fu0.C40481b.a(r2, r0)
            r2 = 0
            r7 = 0
            r3 = 0
            r8 = 55
            r0 = r18
            r1 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState r0 = com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState.a(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.e.a(com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction$BreakStartTimeChanged, com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState):com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState");
    }
}
