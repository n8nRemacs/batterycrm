package com.avito.android.service_booking_calendar.flexible;

import Y41.l;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements l<CalendarHeaderState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingFlexibleCalendarFragment f276102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment) {
        super(1);
        this.f276102l = serviceBookingFlexibleCalendarFragment;
    }

    @Override // Y41.l
    public final G0 invoke(CalendarHeaderState calendarHeaderState) {
        CalendarHeaderState calendarHeaderState2 = calendarHeaderState;
        ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment = this.f276102l;
        com.avito.android.service_booking_calendar.flexible.header.a aVar = serviceBookingFlexibleCalendarFragment.f275617u0;
        if (aVar == null) {
            aVar = null;
        }
        a aVar2 = serviceBookingFlexibleCalendarFragment.f275610n0;
        aVar.b(calendarHeaderState2, new h(1, aVar2 != null ? aVar2 : null, a.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        return G0.f406611a;
    }
}
