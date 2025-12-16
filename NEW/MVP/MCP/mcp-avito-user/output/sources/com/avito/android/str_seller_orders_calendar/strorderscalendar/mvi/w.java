package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrOrdersCalendarFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUz0/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState;", "LUz0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class w extends N implements Y41.l<com.avito.android.arch.mvi.q<Uz0.b, StrOrdersCalendarInternalAction, StrOrdersCalendarState, Uz0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f291176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C35130a f291177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f291178n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B f291179o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f291180p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R0 f291181q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, C35130a c35130a, ScreenPerformanceTracker screenPerformanceTracker, B b12, z zVar, R0 r02) {
        super(1);
        this.f291176l = uVar;
        this.f291177m = c35130a;
        this.f291178n = screenPerformanceTracker;
        this.f291179o = b12;
        this.f291180p = zVar;
        this.f291181q = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<Uz0.b, StrOrdersCalendarInternalAction, StrOrdersCalendarState, Uz0.c> qVar) {
        com.avito.android.arch.mvi.q<Uz0.b, StrOrdersCalendarInternalAction, StrOrdersCalendarState, Uz0.c> qVar2 = qVar;
        qVar2.f92008d = this.f291176l;
        qVar2.f92009e = this.f291177m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f291178n, this.f291179o);
        qVar2.f92010f = this.f291180p;
        qVar2.f92013i = this.f291181q.c();
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
