package com.avito.android.service_booking_calendar.day.schedule.mvi;

import bt0.C25711c;
import bt0.InterfaceC25709a;
import bt0.InterfaceC25710b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DayScheduleFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbt0/a;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lbt0/c;", "Lbt0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<InterfaceC25709a, DayScheduleInternalAction, C25711c, InterfaceC25710b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f275404l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f275405m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f275406n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f275407o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f275408p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f275404l = fVar;
        this.f275405m = aVar;
        this.f275406n = screenPerformanceTracker;
        this.f275407o = oVar;
        this.f275408p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25709a, DayScheduleInternalAction, C25711c, InterfaceC25710b> qVar) {
        q<InterfaceC25709a, DayScheduleInternalAction, C25711c, InterfaceC25710b> qVar2 = qVar;
        qVar2.f92008d = this.f275404l;
        qVar2.f92009e = this.f275405m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f275406n, this.f275407o);
        qVar2.f92010f = this.f275408p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
