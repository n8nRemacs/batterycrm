package com.avito.android.das_date_picker.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import cu.InterfaceC39413a;
import cu.InterfaceC39414b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DasCalendarFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcu/a;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", "Lcu/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC39413a, DasCalendarInternalAction, DasCalendarState, InterfaceC39414b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f132420l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f132421m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f132422n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f132423o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f132424p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, t tVar, q qVar) {
        super(1);
        this.f132420l = eVar;
        this.f132421m = cVar;
        this.f132422n = screenPerformanceTracker;
        this.f132423o = tVar;
        this.f132424p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC39413a, DasCalendarInternalAction, DasCalendarState, InterfaceC39414b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC39413a, DasCalendarInternalAction, DasCalendarState, InterfaceC39414b> qVar2 = qVar;
        qVar2.f92008d = this.f132420l;
        qVar2.f92009e = this.f132421m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f132422n, this.f132423o);
        qVar2.f92010f = this.f132424p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
