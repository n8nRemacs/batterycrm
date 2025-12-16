package com.avito.android.master_plan.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vY.InterfaceC49282a;
import vY.InterfaceC49284c;

/* compiled from: MasterPlanFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LvY/a;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "LvY/d;", "LvY/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<q<InterfaceC49282a, MasterPlanInternalAction, vY.d, InterfaceC49284c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f186082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f186083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f186084n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f186085o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f186086p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f186082l = cVar;
        this.f186083m = aVar;
        this.f186084n = screenPerformanceTracker;
        this.f186085o = kVar;
        this.f186086p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49282a, MasterPlanInternalAction, vY.d, InterfaceC49284c> qVar) {
        q<InterfaceC49282a, MasterPlanInternalAction, vY.d, InterfaceC49284c> qVar2 = qVar;
        qVar2.f92008d = this.f186082l;
        qVar2.f92009e = this.f186083m;
        qVar2.f92011g = new o(this.f186084n, this.f186085o);
        qVar2.f92010f = this.f186086p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
