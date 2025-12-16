package com.avito.android.service_booking_calendar.flexible.header.mvi;

import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import jt0.InterfaceC42425a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarHeaderActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<InterfaceC43160i<? extends CalendarHeaderInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CalendarHeaderState f275929l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f275930m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42425a f275931n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CalendarHeaderState calendarHeaderState, f fVar, InterfaceC42425a interfaceC42425a) {
        super(0);
        this.f275929l = calendarHeaderState;
        this.f275930m = fVar;
        this.f275931n = interfaceC42425a;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends CalendarHeaderInternalAction> invoke() {
        CalendarHeaderState calendarHeaderState = this.f275929l;
        DayItem dayItem = calendarHeaderState.f276014k;
        InterfaceC42425a interfaceC42425a = this.f275931n;
        f fVar = this.f275930m;
        if (dayItem == null) {
            InterfaceC42425a.p pVar = (InterfaceC42425a.p) interfaceC42425a;
            return fVar.f276032a.d(pVar.f405882a, pVar.f405883b, pVar.f405884c);
        }
        InterfaceC42425a.p pVar2 = (InterfaceC42425a.p) interfaceC42425a;
        return fVar.f276032a.c(pVar2.f405882a, pVar2.f405883b, dayItem, calendarHeaderState.f276012i);
    }
}
