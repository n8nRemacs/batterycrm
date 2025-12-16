package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.InterfaceC13931a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarParametersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LGy0/a;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "LGy0/e;", "LGy0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13931a, StrCalendarParametersInternalAction, Gy0.e, Gy0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f287434l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f287435m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f287436n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f287437o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f287438p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, t tVar, r rVar) {
        super(1);
        this.f287434l = iVar;
        this.f287435m = aVar;
        this.f287436n = screenPerformanceTracker;
        this.f287437o = tVar;
        this.f287438p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13931a, StrCalendarParametersInternalAction, Gy0.e, Gy0.d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13931a, StrCalendarParametersInternalAction, Gy0.e, Gy0.d> qVar2 = qVar;
        qVar2.f92008d = this.f287434l;
        qVar2.f92009e = this.f287435m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f287436n, this.f287437o);
        qVar2.f92010f = this.f287438p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
