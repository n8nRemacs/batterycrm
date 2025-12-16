package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingCalendarReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class C extends N implements Y41.a<StrBookingCalendarState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StrBookingCalendarState f286378l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StrBookingCalendarInternalAction f286379m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(StrBookingCalendarInternalAction strBookingCalendarInternalAction, StrBookingCalendarState strBookingCalendarState) {
        super(0);
        this.f286378l = strBookingCalendarState;
        this.f286379m = strBookingCalendarInternalAction;
    }

    @Override // Y41.a
    public final StrBookingCalendarState invoke() {
        return StrBookingCalendarState.a(this.f286378l, null, null, null, ((StrBookingCalendarInternalAction.DayClick) this.f286379m).f286409c, null, null, false, null, null, null, null, null, null, null, null, null, 65527);
    }
}
