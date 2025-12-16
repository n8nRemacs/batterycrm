package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import py0.InterfaceC47165b;

/* compiled from: StrBookingCalendarOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/z;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lpy0/b;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z implements com.avito.android.arch.mvi.t<StrBookingCalendarInternalAction, InterfaceC47165b> {
    @Inject
    public z() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47165b b(StrBookingCalendarInternalAction strBookingCalendarInternalAction) {
        StrBookingCalendarInternalAction strBookingCalendarInternalAction2 = strBookingCalendarInternalAction;
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowCalendarContent) {
            Integer num = ((StrBookingCalendarInternalAction.ShowCalendarContent) strBookingCalendarInternalAction2).f286417d;
            if (num != null) {
                return new InterfaceC47165b.e(num.intValue());
            }
            return null;
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowValidationDialog) {
            return new InterfaceC47165b.g(((StrBookingCalendarInternalAction.ShowValidationDialog) strBookingCalendarInternalAction2).f286421b);
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.PassSelectedDateRange) {
            StrBookingCalendarInternalAction.PassSelectedDateRange passSelectedDateRange = (StrBookingCalendarInternalAction.PassSelectedDateRange) strBookingCalendarInternalAction2;
            return new InterfaceC47165b.d(passSelectedDateRange.f286413b, passSelectedDateRange.f286414c);
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.DayClick) {
            return new InterfaceC47165b.c(((StrBookingCalendarInternalAction.DayClick) strBookingCalendarInternalAction2).f286408b);
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.CloseScreen) {
            return InterfaceC47165b.a.f428902a;
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.ShowRestrictionToast) {
            return new InterfaceC47165b.f(((StrBookingCalendarInternalAction.ShowRestrictionToast) strBookingCalendarInternalAction2).f286420b);
        }
        if (strBookingCalendarInternalAction2 instanceof StrBookingCalendarInternalAction.HideRestrictionToast) {
            return InterfaceC47165b.C12298b.f428903a;
        }
        return null;
    }
}
