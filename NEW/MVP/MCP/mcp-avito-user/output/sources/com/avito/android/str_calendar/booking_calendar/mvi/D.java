package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingCalendarReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/D;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D implements com.avito.android.arch.mvi.u<StrBookingCalendarInternalAction, StrBookingCalendarState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f286380b;

    @Inject
    public D(@Y61.k F f12) {
        this.f286380b = f12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final StrBookingCalendarState a(StrBookingCalendarInternalAction strBookingCalendarInternalAction, StrBookingCalendarState strBookingCalendarState) {
        StrBookingCalendarInternalAction strBookingCalendarInternalAction2 = strBookingCalendarInternalAction;
        StrBookingCalendarState strBookingCalendarState2 = strBookingCalendarState;
        boolean z12 = strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.Init;
        F f12 = this.f286380b;
        if (z12) {
            return f12.a(new B(strBookingCalendarInternalAction2, strBookingCalendarState2));
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ClearSelection) {
            return f12.b(StrBookingCalendarState.a(strBookingCalendarState2, null, null, null, SelectedDateRange.a(strBookingCalendarState2.f286427e, null, null, 12), null, null, false, null, null, null, null, null, null, null, null, null, 65527));
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.DayClick) {
            return f12.a(new C(strBookingCalendarInternalAction2, strBookingCalendarState2));
        }
        if (!(strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowCalendarContent)) {
            return strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowError ? f12.b(StrBookingCalendarState.a(strBookingCalendarState2, null, null, null, null, null, null, false, null, null, null, null, null, null, StrBookingCalendarState.Companion.LoadingState.f286442d, ((StrBookingCalendarInternalAction.ShowError) strBookingCalendarInternalAction2).f286418b, null, 40959)) : strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowLoading ? f12.b(StrBookingCalendarState.a(strBookingCalendarState2, null, null, null, null, null, null, false, null, null, null, null, null, null, StrBookingCalendarState.Companion.LoadingState.f286440b, null, null, 57343)) : strBookingCalendarState2;
        }
        StrBookingCalendarInternalAction.ShowCalendarContent showCalendarContent = (StrBookingCalendarInternalAction.ShowCalendarContent) strBookingCalendarInternalAction2;
        return f12.b(StrBookingCalendarState.a(strBookingCalendarState2, null, null, null, null, null, null, false, null, showCalendarContent.f286416c, showCalendarContent.f286415b, null, null, null, StrBookingCalendarState.Companion.LoadingState.f286441c, null, null, 56575));
    }
}
