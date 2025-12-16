package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import Rl.InterfaceC15056b;
import com.avito.android.arch.mvi.t;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalendarSelectOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "LRl/b;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<CalendarSelectInternalAction, InterfaceC15056b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15056b b(CalendarSelectInternalAction calendarSelectInternalAction) {
        CalendarSelectInternalAction calendarSelectInternalAction2 = calendarSelectInternalAction;
        if (calendarSelectInternalAction2.equals(CalendarSelectInternalAction.CloseScreen.f113424b)) {
            return InterfaceC15056b.a.f14590a;
        }
        if (calendarSelectInternalAction2 instanceof CalendarSelectInternalAction.DatesSelectionConfirmed) {
            return new InterfaceC15056b.C0973b(((CalendarSelectInternalAction.DatesSelectionConfirmed) calendarSelectInternalAction2).f113426b);
        }
        return null;
    }
}
