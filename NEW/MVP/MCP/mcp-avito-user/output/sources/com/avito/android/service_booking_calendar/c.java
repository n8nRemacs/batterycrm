package com.avito.android.service_booking_calendar;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: CalendarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/c;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f275245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarView f275246f;

    public c(com.avito.konveyor.adapter.a aVar, CalendarView calendarView) {
        this.f275245e = aVar;
        this.f275246f = calendarView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f275245e.b(i12);
        CalendarView calendarView = this.f275246f;
        if (iB2 == calendarView.getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar().Y(com.avito.android.service_booking_calendar.view.month.a.class)) {
            return 7;
        }
        if (iB2 == calendarView.getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar().Y(com.avito.android.service_booking_calendar.view.day.a.class)) {
            return 1;
        }
        throw new UnsupportedOperationException("Unknown view type");
    }
}
