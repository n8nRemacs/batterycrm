package com.avito.android.loyalty.ui.quality_service.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pX.AbstractC47027c;
import pX.InterfaceC47025a;
import pX.InterfaceC47026b;

/* compiled from: QualityServiceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LpX/a;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "LpX/c;", "LpX/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements Y41.l<q<InterfaceC47025a, QualityServiceInternalAction, AbstractC47027c, InterfaceC47026b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f184012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f184013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f184014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f184015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f184016p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, i iVar) {
        super(1);
        this.f184012l = gVar;
        this.f184013m = eVar;
        this.f184014n = screenPerformanceTracker;
        this.f184015o = nVar;
        this.f184016p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47025a, QualityServiceInternalAction, AbstractC47027c, InterfaceC47026b> qVar) {
        q<InterfaceC47025a, QualityServiceInternalAction, AbstractC47027c, InterfaceC47026b> qVar2 = qVar;
        qVar2.f92008d = this.f184012l;
        qVar2.f92009e = this.f184013m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f184014n, this.f184015o);
        qVar2.f92010f = this.f184016p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
