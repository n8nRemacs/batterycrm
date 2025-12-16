package com.avito.android.service_booking_calendar.flexible.data.domain;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import com.avito.android.service_booking_utils.events.ScreenFailedToOpenEvent;
import com.avito.android.service_booking_utils.events.ScreenOpenedEvent;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FlexibleCalendarAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/domain/b;", "Lcom/avito/android/service_booking_calendar/flexible/data/domain/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f275681a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f275681a = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_calendar.flexible.data.domain.a
    public final void a(@k CalendarDataInternalAction calendarDataInternalAction) {
        Object next;
        boolean z12 = calendarDataInternalAction instanceof CalendarDataInternalAction.c;
        InterfaceC28373a interfaceC28373a = this.f275681a;
        org.threeten.bp.f f275353c = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!z12) {
            if (calendarDataInternalAction instanceof CalendarDataInternalAction.b) {
                interfaceC28373a.c(new ScreenFailedToOpenEvent(ScreenFailedToOpenEvent.Screen.f278349f, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
                return;
            }
            return;
        }
        ScreenOpenedEvent.Screen screen = ScreenOpenedEvent.Screen.f278362g;
        Iterator<T> it = ((CalendarDataInternalAction.c) calendarDataInternalAction).f275716b.f275728b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((WeekItem) next).f275676d != null) {
                    break;
                }
            }
        }
        WeekItem weekItem = (WeekItem) next;
        if (weekItem != null) {
            f275353c = weekItem.f275675c.get(weekItem.f275676d.intValue()).getF275353c();
        }
        interfaceC28373a.c(new ScreenOpenedEvent(screen, f275353c));
    }
}
