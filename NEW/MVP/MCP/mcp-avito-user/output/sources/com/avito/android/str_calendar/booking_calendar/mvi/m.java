package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import py0.InterfaceC47164a;
import py0.InterfaceC47165b;

/* compiled from: StrBookingCalendarFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lpy0/a;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", "Lpy0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC47164a, StrBookingCalendarInternalAction, StrBookingCalendarState, InterfaceC47165b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35087f f286490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C35082a f286491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f286492n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f286493o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f286494p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C35087f c35087f, C35082a c35082a, ScreenPerformanceTracker screenPerformanceTracker, D d12, z zVar) {
        super(1);
        this.f286490l = c35087f;
        this.f286491m = c35082a;
        this.f286492n = screenPerformanceTracker;
        this.f286493o = d12;
        this.f286494p = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC47164a, StrBookingCalendarInternalAction, StrBookingCalendarState, InterfaceC47165b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC47164a, StrBookingCalendarInternalAction, StrBookingCalendarState, InterfaceC47165b> qVar2 = qVar;
        qVar2.f92008d = this.f286490l;
        qVar2.f92009e = this.f286491m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f286492n, this.f286493o);
        qVar2.f92010f = this.f286494p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
