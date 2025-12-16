package com.avito.android.service_booking_calendar.flexible.header.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import javax.inject.Inject;
import jt0.InterfaceC42425a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarHeaderActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Ljt0/a;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a f276032a;

    @Inject
    public f(@Y61.k com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a aVar) {
        this.f276032a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CalendarHeaderInternalAction> b(InterfaceC42425a interfaceC42425a, CalendarHeaderState calendarHeaderState) {
        InterfaceC43160i<CalendarHeaderInternalAction> c43210w;
        InterfaceC42425a interfaceC42425a2 = interfaceC42425a;
        CalendarHeaderState calendarHeaderState2 = calendarHeaderState;
        if (interfaceC42425a2 instanceof InterfaceC42425a.o) {
            return new C43210w(new CalendarHeaderInternalAction.ShowErrorWithMessage());
        }
        if (interfaceC42425a2 instanceof InterfaceC42425a.q) {
            return new C43210w(CalendarHeaderInternalAction.ShowLoading.f275998b);
        }
        if (interfaceC42425a2 instanceof InterfaceC42425a.p) {
            c43210w = calendarHeaderState2.f276020q ? (InterfaceC43160i) new a(calendarHeaderState2, this, interfaceC42425a2).invoke() : C43175k.w();
        } else if (interfaceC42425a2 instanceof InterfaceC42425a.C11587a) {
            c43210w = new C43210w(new CalendarHeaderInternalAction.HideHeader(((InterfaceC42425a.C11587a) interfaceC42425a2).f405868a));
        } else {
            if (interfaceC42425a2 instanceof InterfaceC42425a.f) {
                return C43175k.G(new b(interfaceC42425a2, null));
            }
            if (interfaceC42425a2 instanceof InterfaceC42425a.c) {
                return new C43210w(CalendarHeaderInternalAction.Finish.f275982b);
            }
            if (interfaceC42425a2 instanceof InterfaceC42425a.n) {
                return new C43210w(new CalendarHeaderInternalAction.LaunchDeepLink(null));
            }
            if (interfaceC42425a2.equals(InterfaceC42425a.k.f405879a)) {
                return C43175k.G(new c(calendarHeaderState2, null));
            }
            boolean z12 = interfaceC42425a2 instanceof InterfaceC42425a.i;
            com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a aVar = this.f276032a;
            if (z12) {
                return aVar.b(((InterfaceC42425a.i) interfaceC42425a2).f405877a, calendarHeaderState2);
            }
            if (interfaceC42425a2 instanceof InterfaceC42425a.m) {
                return aVar.f(((InterfaceC42425a.m) interfaceC42425a2).f405881a, calendarHeaderState2);
            }
            if (interfaceC42425a2 instanceof InterfaceC42425a.j) {
                return aVar.a(((InterfaceC42425a.j) interfaceC42425a2).f405878a, calendarHeaderState2);
            }
            if (interfaceC42425a2 instanceof InterfaceC42425a.l) {
                c43210w = new C43210w(new CalendarHeaderInternalAction.UpdatedScheduleInfo(((InterfaceC42425a.l) interfaceC42425a2).f405880a));
            } else {
                if (interfaceC42425a2 instanceof InterfaceC42425a.h) {
                    return aVar.e(((InterfaceC42425a.h) interfaceC42425a2).f405876a);
                }
                if (!(interfaceC42425a2 instanceof InterfaceC42425a.d)) {
                    if (interfaceC42425a2 instanceof InterfaceC42425a.e) {
                        return C43175k.G(new d(calendarHeaderState2, interfaceC42425a2, this, null));
                    }
                    if (interfaceC42425a2 instanceof InterfaceC42425a.b) {
                        return new C43210w(new CalendarHeaderInternalAction.InvalidateHeader());
                    }
                    if (interfaceC42425a2 instanceof InterfaceC42425a.g) {
                        return C43175k.G(new e(calendarHeaderState2, interfaceC42425a2, this, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new CalendarHeaderInternalAction.CloseTooltip(((InterfaceC42425a.d) interfaceC42425a2).f405871a));
            }
        }
        return c43210w;
    }
}
