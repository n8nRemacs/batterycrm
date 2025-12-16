package com.avito.android.service_booking_calendar;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CalendarView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_calendar/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.a<m> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CalendarView f276122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CalendarView calendarView) {
        super(0);
        this.f276122l = calendarView;
    }

    @Override // Y41.a
    public final m invoke() {
        return this.f276122l.getViewModelProvider$_avito_discouraged_avito_libs_service_booking_calendar().get();
    }
}
