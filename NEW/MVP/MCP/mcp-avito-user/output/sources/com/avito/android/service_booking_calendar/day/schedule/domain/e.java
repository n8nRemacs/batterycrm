package com.avito.android.service_booking_calendar.day.schedule.domain;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ToolbarActionConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/e;", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/d;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    @Override // com.avito.android.service_booking_calendar.day.schedule.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.service_booking_calendar.domain.ToolbarAction a(@Y61.k Zs0.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getIconType()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            com.avito.android.service_booking_calendar.domain.ToolbarAction r1 = new com.avito.android.service_booking_calendar.domain.ToolbarAction
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$a r2 = com.avito.android.service_booking_calendar.domain.ToolbarAction.ToolbarActionIcon.f275536c
            r2.getClass()
            int r2 = r0.hashCode()
            r3 = -477087922(0xffffffffe390374e, float:-5.3206325E21)
            if (r2 == r3) goto L3b
            r3 = 125666345(0x77d8429, float:1.9072443E-34)
            if (r2 == r3) goto L2f
            r3 = 1069142654(0x3fb9d27e, float:1.4517362)
            if (r2 == r3) goto L23
            goto L43
        L23:
            java.lang.String r2 = "workHours"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2c
            goto L43
        L2c:
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$WorkHours r2 = com.avito.android.service_booking_calendar.domain.ToolbarAction.ToolbarActionIcon.WorkHours.f275541d
            goto L59
        L2f:
            java.lang.String r2 = "additionalSetting"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L38
            goto L43
        L38:
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$AdditionalSettings r2 = com.avito.android.service_booking_calendar.domain.ToolbarAction.ToolbarActionIcon.AdditionalSettings.f275539d
            goto L59
        L3b:
            java.lang.String r2 = "addBookingBySeller"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L57
        L43:
            java.lang.Integer r2 = com.avito.android.lib.util.q.a(r0)
            if (r2 == 0) goto L54
            int r2 = r2.intValue()
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$DesignSystemIcon r3 = new com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$DesignSystemIcon
            r3.<init>(r2)
            r2 = r3
            goto L59
        L54:
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$AdditionalSettings r2 = com.avito.android.service_booking_calendar.domain.ToolbarAction.ToolbarActionIcon.AdditionalSettings.f275539d
            goto L59
        L57:
            com.avito.android.service_booking_calendar.domain.ToolbarAction$ToolbarActionIcon$AddBooking r2 = com.avito.android.service_booking_calendar.domain.ToolbarAction.ToolbarActionIcon.AddBooking.f275538d
        L59:
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getUri()
            r1.<init>(r0, r2, r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.day.schedule.domain.e.a(Zs0.c):com.avito.android.service_booking_calendar.domain.ToolbarAction");
    }
}
