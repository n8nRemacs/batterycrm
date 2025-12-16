package com.avito.android.service_booking_calendar.flexible.header.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import jt0.InterfaceC42425a;
import jt0.InterfaceC42426b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CalendarHeaderFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ljt0/a;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", "Ljt0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f276034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f276035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f276036n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f276037o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f276034l = fVar;
        this.f276035m = screenPerformanceTracker;
        this.f276036n = mVar;
        this.f276037o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b> qVar) {
        q<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b> qVar2 = qVar;
        qVar2.f92009e = this.f276034l;
        qVar2.f92011g = new o(this.f276035m, this.f276036n);
        qVar2.f92010f = this.f276037o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
